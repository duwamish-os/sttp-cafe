import com.softwaremill.sttp.{Response, SttpBackend, sttp}
import org.scalatest.{FunSuite, Matchers}
import com.softwaremill.sttp._

import scalaz.concurrent.Task
import argonaut._
import Argonaut._
import places.{Place, PlaceResponse}

class ScalazCafeSpec extends FunSuite with Matchers {

  val ApiKey = "<KEY>"

  import Place._
  import PlaceResponse._

  test("deserialise") {
    val serialisedString =
      """
        |{
        |         "geometry" : {
        |            "location" : {
        |               "lat" : 47.6228195,
        |               "lng" : -122.3551413
        |            },
        |            "viewport" : {
        |               "northeast" : {
        |                  "lat" : 47.62416892989272,
        |                  "lng" : -122.3539342201073
        |               },
        |               "southwest" : {
        |                  "lat" : 47.62146927010728,
        |                  "lng" : -122.3566338798927
        |               }
        |            }
        |         },
        |         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |         "id" : "2f265092f0e0968dc407a9539815781395ce36ea",
        |         "name" : "La Marzocco Cafe",
        |         "opening_hours" : {
        |            "open_now" : false,
        |            "weekday_text" : []
        |         },
        |         "photos" : [
        |            {
        |               "height" : 1365,
        |               "html_attributions" : [
        |                  "\u003ca href=\"https://maps.google.com/maps/contrib/112118594871223347286/photos\"\u003eLa Marzocco Cafe\u003c/a\u003e"
        |               ],
        |               "photo_reference" : "CmRaAAAARXNxKt8spWWPmS8eRGe8Jzeas9XDV9JOs19Iz3nl6DWxKYkPCCQYyJsBpi_gDAjWYSaiOHer4yvOyR2Npqzd82xQhurmkosvrC9axC5kxrVOj6gpL9izTje7wK8B4fewEhDlN-uvw5ZjPoIekHsDSKfhGhTA7stU4cyp6WG5SRlz4uqCCQzlMw",
        |               "width" : 2048
        |            }
        |         ],
        |         "place_id" : "ChIJIbZXcUQVkFQRG6tzRinKJjQ",
        |         "price_level" : 1,
        |         "rating" : 4.7,
        |         "reference" : "CmRbAAAAgOvh9OYtKSn9eLXQOxYZLVs-XFAtX89oy7WdFF2_xesEj4qMhSPwxAqlfgZMxLIeTWM92yx-GXgDBHRJ5vw3m5M6MsC-t-jx4D_JH61rybjy0y-EQrev0TWULi7aF2xHEhDhgVK0se3UPmJ8JSadz0IUGhSo-48Thep9JGvYt-0N_e4LReztyQ",
        |         "scope" : "GOOGLE",
        |         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
        |         "vicinity" : "472 1st Ave N, Seattle"
        |      }
      """.stripMargin

    val deserialised = serialisedString.decodeOption[Place]

    deserialised.map(_.id) shouldBe Some("2f265092f0e0968dc407a9539815781395ce36ea")
    deserialised.map(_.name) shouldBe Some("La Marzocco Cafe")

  }

  test("deserialise nested") {
    val serialisedString =
      """
        |{
        |  "html_attributions": [],
        |  "next_page_token": "CvQD6QEAAGZev84Bs4ZuE0Fa2DQZaQgPy-3t7CwBUHuXI6jKxrvh-7RAjp2UiD-yLpKhdeUuUt3QRhQMiirxk_JAvOu583TS7qZgckFlZ1fnj39m0Jd7FcfxAAnoY5ScqJoEDMqDQwLOA6E9XzeyoqdEGEikhvClOS3NUl-kbNxo2RYJPdFz1Y-B0CZjxrpqHA0HBKBtBDb5-NI953bSdS5byj6mxpX2BPDQxCPryjDmvVF_xqVI4yyI6F2b6yv-VqCbRUcsORLyKGFoNeIRli20WBNyui7OCqm06kG_nL1o4u9fJzLPCgCgyvoi6XK81MVlke7dBzZoUzR_td-XHW8yh6CCj_3hxSGBURVs2E2byD16ESEbQ0MvOEIQZKsR0YyGMpnFkauNZ9XRUGs7dGnVoqfedutBbfam_xrH60RQ9lx4iClJzj8vlNTNCZWHdi1QpC7BG0SAwku4TgvcmNU4nZKFkPY_UjhHN79r-EzMvHaXw_Ah4YD_vMr42uDV5mGdktW-2LLWgcfZ_tyqA1JikgAWDqE7RCuWoRNQ1ylLT3xl8uIpmNW2u0Imowa2AJGvPF9pRvXjoHcS_k_QTAIxUGPNNC0KtU_MnCU4tWuBtgZMIb7Aeed2Ep0_KWq1QdbXgs9H093CpxbuPbvJGdyDsGQO_QcSEM4lpOV9GSgwWeXxVYS2PUQaFEJNO7aiINladbpKdk-BHJGZDeID",
        |  "results": [
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "2f265092f0e0968dc407a9539815781395ce36ea",
        |      "name": "La Marzocco Cafe",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJIbZXcUQVkFQRG6tzRinKJjQ",
        |      "price_level": 1,
        |      "rating": 4.7,
        |      "reference": "CmRbAAAAlo9saWlsFDjEWdzHSqu4Pu1dsp4X3uOdNyAf2mVForunb6M1p3vA0yV8KqUfu7HIiqNxUNO275cAMCGwtz-Fl5BpfN-A8fKwRxtNrb3bZiwA5xlrzul-LxW-ssoYd_8sEhCGqLYrj5BQUXKmBHeNDk7gGhSb9jIINCfFG2NEpl1HRMCT0kickw",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "472 1st Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "bfd697b1d69da09609d13bd1b6bdc64ddab967a6",
        |      "name": "Citizen",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJHVQ7VkcVkFQRqX1RPUYV9DQ",
        |      "price_level": 1,
        |      "rating": 4.5,
        |      "reference": "CmRbAAAAXJb54hpiowmKWCwonDhTjUTaii2dOimgqxSKU3nC_xYZ_WApcbWHGgPp7rr5KGnVEXXXyUCy3kjKzKHKyrlIFpryV5LjcmPv6MQw55bQibEE6Qjp8WklnE0_IWyRZgbrEhCSv0WryH3pq7qqYX-JzW4KGhT0W7CYgGytablBQla8Yn5KNOzUNQ",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "meal_takeaway",
        |        "store",
        |        "restaurant",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "706 Taylor Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "798274c8f77696e51ada984102ea3bedb0414eb2",
        |      "name": "Caffe Fiore",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJA9sMeGwVkFQR5QDcauwfq6s",
        |      "price_level": 1,
        |      "rating": 4.4,
        |      "reference": "CmRbAAAATZCmPvxbjNnRbIqVa8qlKUyyfD3Bfw3AtORnFM5-3ZxKLwRLDwSuRgu0cf9GcLUGPqHGRydB8q1oq8jwVKJy_45JjuRuGynyr6m64KXl0U16rVCo7ViOWS7k8ZPoVsvCEhClFvZqG7VFMbP5Brmav9N8GhSqrdzKScYPCpm56IbfL88bj8Iiag",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "224 W Galer St, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "580d45b06ba69f2a3ae18516e82a9a0e354c5d6e",
        |      "name": "El Diablo Coffee Co",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJEfX1ORMVkFQRFaNpuEr6OUE",
        |      "price_level": 1,
        |      "rating": 4.6,
        |      "reference": "CmRbAAAAIfcxvpn7R4vzbXyYAvyO9UAQSuteEcAnmD7tTA5x6tYO5mZqd7iUDVHru0MmA_u9gXmFQC1RTSS1suKPa7poEHFZw2e1-UOoZGB9Pv5BmLBBMJuumwq0l9SvMB_3OtaUEhCH5Ud2SU2I-KUCQOVowWwoGhRKHDEKgFFhEncIJsKOwv470l9xhg",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "restaurant",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "1811 Queen Anne Ave N #101, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "28b113bc19eb698cc96f70d4bb452002009d49ed",
        |      "name": "Caffe Ladro Upper Queen Anne",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJjeYIeRIVkFQRQOTWHF40t4U",
        |      "rating": 4.4,
        |      "reference": "CmRbAAAAQxDIJWdDyBDshxRpStjel3cr5zF274GXGQcpc2lzUzMSCRm9eXuwtTlK9q13obPPzetNZVq-gWFWNzg525_P-kSE6lEwilCYA6VS4GDWMA1id928ljaMaNVBzENU73KREhBuu-9j2hmX0niS6yMprVvyGhQryWbff1XYbGE37m7YPLTBR-3PXA",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bakery",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "2205 Queen Anne Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "8c07a88ff6a77fc219dce2987093131459f059a3",
        |      "name": "Dilettante Mocha Café",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJN17EiEoVkFQRNqHYhQ_DI3w",
        |      "price_level": 1,
        |      "rating": 4.5,
        |      "reference": "CmRbAAAAa_XVpJ5m8snjp6zkCCVgOu5YPHe0rc5xWG5EkxTHPZ39CbTaAXQsdv3xUr9yI4MeWJJpuxF5Tlxp2dOccXtFHQiFUZNa60Spe4zCYjmtdc8LluHvuVi_hJwdeqz2LoaiEhAErW10HcSZGkf0z9epThF4GhQdul4zZXxP195qAPrGLhK7HvRYxQ",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "818 Stewart St, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "6cac1f19d959b1824953ead9381cadaae57878b1",
        |      "name": "Anchorhead Coffee",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJgdrD00oVkFQRbSXCy0wr9RY",
        |      "rating": 4.6,
        |      "reference": "CmRbAAAATZ3uhAAoOhXYBcOqZ82pTgeOQu69pswXOUT2dlqtFTAP7k58BE6Kq7FrsjaJKMZz7GEuJHqiXJZ1o5DfJ4SbFKyBLWXzTU9vT9RFaZHAh-lyIiw627Bi-u5yLfxoxW7AEhDI9qq7HayIRswh28SIEGnrGhTuq1MwOL1oUqX65NYVjsomGohB9w",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "CenturyLink Plaza, 1600 7th Ave #105, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "f59d7ae98eef846b13196454ebb34893f8a365ff",
        |      "name": "Moore Coffee Shop",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJl0E_zkwVkFQRczdVGbfpPvI",
        |      "rating": 4.6,
        |      "reference": "CmRbAAAAcBdnCFnK77PSJ21rG1tW6IVgh2QfaLxxUlxH4CQZ0IxZvCHty6E9MeU4-HfBCF-EFsjWQ-7jt81-bnlWTV3Il89WdXBEbOtvPhUNnaMCgQNMJpzi-GCpfDj9ecfBLYAxEhCmxiSCM1eiVcXJDX8CtBc2GhQyGCvHrkTJ_7ctnkuOHFCVmrhK_g",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "1930 2nd Ave, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "8db48cd2beaf02b4a8bb97b62246565a011ea8e6",
        |      "name": "Herkimer Coffee",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJZduL0j4VkFQR-7mU6agKJDQ",
        |      "rating": 4.6,
        |      "reference": "CmRbAAAAnfZCNM8a1B5DMyelobnr1GR9GKj-GaR21Q7ncXakNgPEuohcq1JncR4lbnfV7dDAiCb-J04AKF3Ci9XNF0fPocn7U6iuknqB5i4g4-Jo75-BpldYmaZ1BMxrjiJdLC2AEhC_aiXeM7DBd7cLrFXX17reGhQLiC840j_wgcByERN4pDhbKnEsgg",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "901 Dexter Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "5a972bfecd5b0df3477193e71919b6a2e30f9cbb",
        |      "name": "Specialty's Cafe & Bakery",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJ5fMbXkoVkFQRac1DmYO6JpM",
        |      "rating": 3.8,
        |      "reference": "CmRbAAAAHwNp6p_O7YKYCO51Nu2gIGK_lGFGAYoPvm2ZeujWCWMWzNR5srqKp8I0PhBKQMVsOi5tqR1btEj3IQkHwN03k4kBPntozYcS-VCJnYLBybDRb59EJXioJqCFjJYxeYJBEhDhkeVVfeQs-UA96GkYJEFWGhTUKzs6UYkL06XMGyLIA-Y5inCPAA",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bakery",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "1918 8th Ave, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "5c54d5cb058018dcd2595d5335f6014aad064842",
        |      "name": "Caffe Ladro - 1800 9th at Howell",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJh4vnnUoVkFQRlKP4go2C2aY",
        |      "rating": 4.1,
        |      "reference": "CmRbAAAAoh8dEzh-fKMM84G4_jyfW-q0xxTdReA8A1Zpq3YwsIMH0DVWLhSAdE7l4cRCkcPX2CB6lL1ceq21hu5V-TueCg2q19fcLEyMAIsmuqXtOkqIYpsFJJSIUY05x5rTC1d9EhDcH7_k62Rh8uYeg-hs4LV4GhTqlhNiAwlQIoFX6NsczDNJTrO83Q",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bakery",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "1800 9th Ave, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "dd73ebb0e5e949a8d97f085b54ea177cf1e5c95c",
        |      "name": "Caffe Vita",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJLXOSXz8VkFQRYN_ttFy3X8s",
        |      "price_level": 1,
        |      "rating": 4.5,
        |      "reference": "CmRbAAAAd66k5miIWhThqymFh3b6drMAaBdhLZRgp8TYI_DIL0H3HO30j-sJVYDF0AFYFniG6Bluz7poYBXBcTpUMFDTvKqXBGvnv15cbRrOHywao3KQzKts6mHPMZxmRx41_NAjEhBE0bOADkzI8yFd2vkmmXCdGhR_0lBa5ROSzGkINDdPauH6wMxbkg",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "813 5th Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "f9fc128752ac98e5ff08e526d268b174da5ce351",
        |      "name": "Caffe Ladro - Lower Queen Anne",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJr_LSz0MVkFQRMqUoqHwlu00",
        |      "price_level": 1,
        |      "rating": 4.4,
        |      "reference": "CmRbAAAAzmcGUg0eidL2_IyXHr50GJu0YvfcNqPoY9h6CYOAovg_8uEgK9ykCOuiyd-MjfsDH-7jxEca6B_ohS4wG9caQerqrVOxX4uxniIIG8Ks8ia-MA-x4HaNK0h9dQHRy-gBEhC-FJLa4dc0TZgAFMDBsA7hGhTHzWG5FqR4vKPwh05OiyDFDoszvA",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bakery",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "600 Queen Anne Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "acd46099bea043d0b78bb8f63272a4084917a3e8",
        |      "name": "Caffe Senso Unico",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJvwKi10oVkFQR6XaZSD_r2wA",
        |      "price_level": 1,
        |      "rating": 4.8,
        |      "reference": "CmRbAAAAKBHAcYE7Gezc5JpPiN7vf5PDa2UYUeiSLwhjLJL1rlDtLgoqNxcBFVVfTzUx3drk5nXnycJflSoxIl6mJ2DERiLFNS0mEZB-MXgTXYluQBd-Wz-zJ3eC-oH0g7a-hPUNEhB67NqvtDuALMWBxegjCCVoGhQGfyHOe1cHx0X78HtJrVIQ68cf8g",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "restaurant",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "622 Olive Way, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "75eca1ee699810755ebe88d3b56fde6fdfeae7a0",
        |      "name": "Caffe Ladro - South Lake Union Fairview",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJVaEoOzcVkFQRuv3X7USdip0",
        |      "rating": 4.6,
        |      "reference": "CmRbAAAAHFXai0QI3L2xggXx77zNw47HZbgg4TW1GXFcL6lXg8ItRsHfff4VLHuFGUHWd1UEyhGMhBs-11BBdzzuCuV39VBkN2p9uvVzXQFNu0WJqcUGv_c7RDiRdxmWL_cuPuX7EhAdwuTTJV0xef9JGrBnaLbDGhRCgE70P-CJMAEt7jmryW-KlAjfsg",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "400 Fairview Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "c906e98257961b48e149ec5746f7f8e91aeb8b8d",
        |      "name": "Street Bean Coffee Roasters",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJ3X6BA08VkFQRqC7NsOPY5Ps",
        |      "rating": 4.7,
        |      "reference": "CmRbAAAAEkZUOm50bYiVIZSWLWRHaI6VwO9WZepqHM2LDk4XPQt6UeWnUwpjJzup-ywWeDK3DzrXNjpqI_FwdvWzZcLpOWSmSYl0LWF8hsCAUkPiC9_NwtHvg5p_mDFrCYWFcaYfEhC7YKhEBIr6wMmax4qyWv4EGhTcwJVmrpN2dp4lb9BzwID67DUsdA",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "2711 3rd Ave, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "b9fd5eaef1432d28909fb18d5eb102bede5c93ec",
        |      "name": "Mr. West Cafe Bar",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJnzzCxkoVkFQRTECoVWZJFiA",
        |      "rating": 4.4,
        |      "reference": "CmRbAAAARiTKmvqj2TBcHSsUguZqi-xKQnNmuKZMowtMtCvX5awrXZKdb9VSft0PFFfEk3UltEHdEYniQnaYUNP5vGgC3Cf_fnR8BV5pYMGghF5at0vudIhz_FbBTb4a0WB84g4oEhCeJGc-0s1k53lmzaWVesIRGhSqYgyF5KNY5lmhc5qLRdRDAfkuNQ",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bar",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "720 Olive Way, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "5e3d5b8fe232ebdd245c53d7017e8bb419e2a28d",
        |      "name": "Storyville Coffee Queen Anne",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJO2_aZRIVkFQRgRwytGfQ00g",
        |      "rating": 4.7,
        |      "reference": "CmRbAAAAgcjSqDtlrVE43Uydg1rvQDAch_YAOZ1Pu6ivq0CgkNUBTXWG5iY1BbVn8LVipg5rwfKQgYQQ1GoqtPpsNLOMKDRt0aYdDlWkHfEhBsDI9OVZqEq5504AsYaB02UQHMA4EhCy3A7_VLWaO1IUBlisTetgGhQEZbXkZcc7atssYA6sEJNa8El7cg",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "bakery",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "2128 Queen Anne Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "76b424bc26e8634a2964bc58999b71269708597d",
        |      "name": "Rococo Coffee Roasting",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJja6LRTYVkFQRAimRJX2E3mY",
        |      "rating": 4.3,
        |      "reference": "CmRbAAAAErJMtc94ImnNEvroy6pLlJZkH6OugcptaNVYHSMiJy3qvcxh8utaoz88L9vrI708Yjvc7M-iVk4kSdxaS3zBHAKcVdaFmkGQce3uKtfYuTxOtFyRrtH2cm2-1ZdAxSEGEhD70ENCZaUbdRButrzW5BvdGhSsK5iTB45LimAlF1G4DIsWLg4HUA",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "207 Boren Ave N, Seattle"
        |    },
        |    {
        |      "icon": "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
        |      "id": "697a1f67f6f7189073c18c3623798eea75254030",
        |      "name": "Uptown Espresso Belltown",
        |      "opening_hours": {
        |        "open_now": false,
        |        "weekday_text": []
        |      },
        |      "place_id": "ChIJTUxGxE4VkFQR59zWpPn6SYo",
        |      "price_level": 1,
        |      "rating": 4.4,
        |      "reference": "CmRbAAAAUoAjh0Qz6ncq2s9ZQOkxm5wLhEeWTsQl_rSYgUx5Hq81aYN2j9XamTDPnG7uuusuxzf9hoalnoX1fOCcaffI2I_NojcMNAsrfSf-jDEplIGg0C1IaTsEqXb8mUDVp0LQEhCYSKsIjGQ3tk0KNL0u1F2IGhTVkDac0S2tYNKvHR17DSMNd3b2nw",
        |      "scope": "GOOGLE",
        |      "types": [
        |        "cafe",
        |        "store",
        |        "food",
        |        "point_of_interest",
        |        "establishment"
        |      ],
        |      "vicinity": "2504 4th Ave, Seattle"
        |    }
        |  ],
        |  "status": "OK"
        |}
      """.stripMargin

    val deserialised = serialisedString.decodeOption[PlaceResponse]

    deserialised.map(_.results.size) shouldBe Some(20)

  }

  test("google api") {

    import com.softwaremill.sttp.asynchttpclient.scalaz._

    implicit val backend: SttpBackend[Task, Nothing] = AsyncHttpClientScalazBackend()

    val CafeType = Some("cafe")
    val CafeTypeKey = Some("coffee")
    val LatLong = Some("47.626596,-122.352569")
    val Radius = Some("1500")

    val httpRequest = sttp
      .get(uri"https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=$LatLong&radius=$Radius&type=$CafeType&keyword=$CafeTypeKey&key=$ApiKey")

    val httpResponse: Task[Response[String]] = httpRequest.send()

    val response = httpResponse.unsafePerformSync

    response.code shouldBe 200
    response.body.exists(b => b.startsWith("{")) shouldBe true

    response.body.map { res =>

      val places = res.decodeOption[PlaceResponse]
      println(places)
      places.map(_.results.map(_.name)).getOrElse(List.empty).foreach {
        println
      }
    }

  }
}
