

- get google places key - https://developers.google.com/places/web-service/search

```bash
curl --request GET "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=47.626596,-122.352569&radius=1500&type=cafe&keyword=coffee&key=<KEY>"
{
   "html_attributions" : [],
   "next_page_token" : "CvQD6QEAAN6aLFB80GsdXS8HEX2vESN1_3o9apqwQDisUGMaXHjVYM_580TNLuh3JUHTWkw18MZiCX_IWzD1xqXjwTESfrxRN3EaF-qox4WqzoDeLxkLdzA4OXGKI_BD-6OBc_GJjxOQFg94CLEN69vj9qkkqcCWbgfo9j_GYmHSF417UxPxnklnCoZ4qv7HnLYVxhzB0-H3WtBL70NK4honCZ4yycaBqAzZeOa1mBpBvrE77rZRxtvbjwVUbgl9X_PwHJ-wenBc520aFakNZmi3rCutXGn3ucZRCrMP4RJcQGvx0sWDBbyxJFbTK5Vc7gNbCJwyjGq54v6ixx8Mleb0UeAk5Y5OrETjUmqdTQwXHXPOfJEpecqCKZKbJClr7z-uvVCO1n9S5NIt9FugK8AjdP1e7GOH69OQPiHXlMXornA5qyprwDaC6O1V-U-9b2Aa5J39HYZduGDw1KN-yQzL1gYw0MvfHBeA2vCEPaPvoaJagbBh_5GC-H1XADyceGTxe977eCspaV2CEKEG-v4UaK4fmr56484NQ9JYi_Phlk_BvdGWUEtYuck5MPyqOgK_A432Hvj92gz8WCCk39UCq20muQDGMBln_aB85iblb71tex2GRisYYE6DGboI0lTzyzUCA_xrkJBy_q_HJ7-77H4B9sYSEDdfPIJMW4zfnni4LUDff8gaFHsJObpl8IHEqDU9YFGOBUMV2aDv",
   "results" : [
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6256997,
               "lng" : -122.3459644
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62704932989271,
                  "lng" : -122.3447690201073
               },
               "southwest" : {
                  "lat" : 47.62434967010726,
                  "lng" : -122.3474686798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "bfd697b1d69da09609d13bd1b6bdc64ddab967a6",
         "name" : "Citizen",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 2268,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/110657904846247476273/photos\"\u003eDavid Summers\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA8cOwIj-KAign-6-j1hwmfF6pixlTl4FW-4c1_oVpRk5tLlQPnIOF9OqIvYf1fNxjp5AKQW2RZK_Wxc81-ti2yfm4j0-g03FYDiMNl_Wg1h2GN3O-p2hWa8mmD4vfq6tnEhDZ_kqigwJDICHejz8j-D-2GhRoQcalAtJQOMk1p-gcBIlbu1ytdA",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJHVQ7VkcVkFQRqX1RPUYV9DQ",
         "price_level" : 1,
         "rating" : 4.5,
         "reference" : "CmRbAAAAUyUSWyHfraoW4xrd9rAeIF2Tb791Pb8bi6ITL3Bp-nvuBJOXonPkO4TadXo6NIeCGqVJ1IlPdmuzCV_hUlBWjAJgiTDwiwrkpqTy7iNGP5WtlLMmhDH9A33Uze2dr9JtEhC8HmyXe0X1tDDju4xF8tn9GhSWlZhXQjhPlR_D0d9awNiNqgR-HQ",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "meal_takeaway",
            "store",
            "restaurant",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "706 Taylor Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6228195,
               "lng" : -122.3551413
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62416892989272,
                  "lng" : -122.3539342201073
               },
               "southwest" : {
                  "lat" : 47.62146927010728,
                  "lng" : -122.3566338798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "2f265092f0e0968dc407a9539815781395ce36ea",
         "name" : "La Marzocco Cafe",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 1365,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/112118594871223347286/photos\"\u003eLa Marzocco Cafe\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA5V6XftBDV-4b9KcbJ7wpReRLktbXsXY9oUjXwwzI925g2tTluLMTKRqRRBfgkI3PlKvdssl1zRt2rWbGrqFQE6saULWyKFBAPaUKPmVsKw6JhchdyJkRuJ2dm_ZayE8eEhAiiiF0JoWJDprTV6T0wiCDGhQjKMKcSUlYWLUszkXp4iIC_GHecw",
               "width" : 2048
            }
         ],
         "place_id" : "ChIJIbZXcUQVkFQRG6tzRinKJjQ",
         "price_level" : 1,
         "rating" : 4.7,
         "reference" : "CmRbAAAARzY9fgpee5jwnShI7Cu2UOJKpFDZZsXX_Um0i9vPYpschU0kX8-MRMkJM3TThdm9rH-z3FQlJCTLcKWY_iX7frWy-hksPTyYg-wJSw07JdIoMXenQBvnVjcHznMw-GxnEhAzm1SQwpBQOMhMqe3fFF90GhTzAYAgyViYbCqYJQLuGGOguU3WRg",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "472 1st Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6324657,
               "lng" : -122.3608624
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.63374342989272,
                  "lng" : -122.3595124201073
               },
               "southwest" : {
                  "lat" : 47.63104377010728,
                  "lng" : -122.3622120798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "798274c8f77696e51ada984102ea3bedb0414eb2",
         "name" : "Caffe Fiore",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 2988,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/110257207897209916421/photos\"\u003eRyan Cross\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA-1uFlAS9kPxKQZwp7sAr64zVfuRbQkG8lXa9Mee4olecua-9lkFgm-OdSAfxJ5aXBW3Rwtmj24OGCjBHYRte2P-P2JPQnCT3e93nlzIp1cGZ43UbWhVxjvFR1Uo8h9BtEhCxnL4h14QcSqzmcnH4LmKXGhSHKUmkDbFwgE9qh1WKVrgChdNO8Q",
               "width" : 5312
            }
         ],
         "place_id" : "ChIJA9sMeGwVkFQR5QDcauwfq6s",
         "price_level" : 1,
         "rating" : 4.4,
         "reference" : "CmRbAAAAkrTVxMsIwjvHYXX_RjANJBzRJych0DPFMBj8G2PkXYm7Q22JMx02oqi_EkrlXw2jiSl1D_6574PByeGY1tqgefoqhEMKUwtLkhMaBGzpQHsyfeoSbGbCF4p3CX9j8SK6EhDDFRmWQnnou70KZS2Lu2syGhTAQumWySXkVC_DuW2Z3Q1o1hE0oA",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "224 W Galer St, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.63520339999999,
               "lng" : -122.3573437
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.63655322989271,
                  "lng" : -122.3559938701073
               },
               "southwest" : {
                  "lat" : 47.63385357010726,
                  "lng" : -122.3586935298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "580d45b06ba69f2a3ae18516e82a9a0e354c5d6e",
         "name" : "El Diablo Coffee Co",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 2448,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/109402005352328377218/photos\"\u003eSin Ko\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA6lTVuIt_ISY6o0oyAwf-TpFUK3hvrTTxyUA4NCA5jkg7dpe9RL1SA5b-DrBdzGyRC_x_Ub80CeWNIieODwW9FJ8wePeWiE-ql4nx858KPPRlw3QQVWUsvJp2gRxt9zzDEhCOyzAgw1XxJyyakEDFnGGkGhRJL_yNnLVxRlTTvR7cj-iAXtgVtQ",
               "width" : 3264
            }
         ],
         "place_id" : "ChIJEfX1ORMVkFQRFaNpuEr6OUE",
         "price_level" : 1,
         "rating" : 4.6,
         "reference" : "CmRbAAAADVjkkgo8ytDGCVEN5dLh9gjsSzBTOsq1KSCQt0ceO-dxaL89ESlIZJC9DoPwi8q5ZYbsbVrhcP_p-D9w7F7n1EwRMfwkMlXtxbCY9pyYcsME0XWHRfX4XQhjQ2SfYCRCEhCuR-IGMAjJsQZOXvcedCl0GhStRShP922LxakJk9dmECfx6DbW4w",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "store",
            "restaurant",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "1811 Queen Anne Ave N #101, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.638656,
               "lng" : -122.357113
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.64000602989272,
                  "lng" : -122.3556738201073
               },
               "southwest" : {
                  "lat" : 47.63730637010728,
                  "lng" : -122.3583734798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "28b113bc19eb698cc96f70d4bb452002009d49ed",
         "name" : "Caffe Ladro Upper Queen Anne",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 4320,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/103411419702326043444/photos\"\u003eJustin Cummings\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAwoPuxAhgVG1jK4EtdnRmm7PA-PcyU_nqfL1lKdaM9hQ4Eejzwy2ajDEqEi1SnaK4AieXOU10RKGQ6AZQYdauwIneWLasIZe4EC5dWByWyFrL66SlgeRJItI4VfbdGlIFEhCKTsGfug8dwN5gc7l33vOtGhRsTzKZ-bCdX4i16QnTNq0yzDsiEQ",
               "width" : 2432
            }
         ],
         "place_id" : "ChIJjeYIeRIVkFQRQOTWHF40t4U",
         "rating" : 4.4,
         "reference" : "CmRbAAAACd2STNUtp-tSrTHtweOOpLhDfZZTwPtPMu1LBqhAsh2JuNfMo6kcGKhsduzjNHbQrjz4p7lQX_AfEd16B_Hrl-PPbLbpcCma-KGB_Cke3pGYT9GupVt45sUwpEQNd2BQEhCZGXMIGy7645UAGy7BIqyKGhTV8B8q6Ea7DVpYnwp8ovyaaa8w0Q",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "2205 Queen Anne Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6134003,
               "lng" : -122.3347638
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61471012989272,
                  "lng" : -122.3335060701073
               },
               "southwest" : {
                  "lat" : 47.61201047010728,
                  "lng" : -122.3362057298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "6cac1f19d959b1824953ead9381cadaae57878b1",
         "name" : "Anchorhead Coffee",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/115188564347317450071/photos\"\u003eHsiao-Chen Chang\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAlbGFhbBHk-bqHf9VolmiT85eIfRkGi27zYisdwU5eWCtNql4z_5N4IjII7u_4XCzjlQEkfR5VHyM5PLEqFQz2xw1JJVpcp7eEXhiKSJBoBjNdE3DK4nfEtDhjM9cRzmREhDhJIQpJoPRNFiwO4eKae-eGhSil3gYaGmRKAbk3ZKHEaqgT0InUA",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJgdrD00oVkFQRbSXCy0wr9RY",
         "rating" : 4.6,
         "reference" : "CmRbAAAAZMSE4U8G03_GtDQA2_bZ_y5_MO94j29BjQpjXNoDLlh6Lb1Q4KP7nGeFnS-FDYQYfi0BVZEbbCEVTYI282MW6WfVwqTRRB9InnoQyowuRi-_eeGynyIyUW8wMlQsxhPLEhAR9YMbo6x-GjCQk8RhdfYjGhS0DHWC7uuJuRk-X6Wh5GObXuzq1w",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "food", "point_of_interest", "establishment" ],
         "vicinity" : "CenturyLink Plaza, 1600 7th Ave #105, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.615581,
               "lng" : -122.334953
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61693082989272,
                  "lng" : -122.3336031701073
               },
               "southwest" : {
                  "lat" : 47.61423117010728,
                  "lng" : -122.3363028298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "8c07a88ff6a77fc219dce2987093131459f059a3",
         "name" : "Dilettante Mocha Café",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/101270452065314565732/photos\"\u003eTamella Hajiyeva\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAL4ui1Nn1B31N9w6b5PDc-vfDFXFxvlbRSEgs07q_NKCXiipDae334XuwPZk7NO85AbH6UK86ekLE05HYyVmuGG_yUHZqSHo835yF-C6-zNCZ0bJLzqanMf76btcIk4txEhBC2g5sLlhbj5S4GNk2HJffGhQ4AWoX1zbRZjSpDbn2xcX9-YE4Pw",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJN17EiEoVkFQRNqHYhQ_DI3w",
         "price_level" : 1,
         "rating" : 4.5,
         "reference" : "CmRbAAAAdeXvmhb9aq5ht4_0oOvSuhw9uzeMEsFNu3_-UnxEyqs7v0GBUGI_wrVRH3sn6wkAM5YqDUUTS0zbq1ukl9Q2w_NSDV_IftZg34a6ZHth8FGLOU59uLJkgOfQ4KviBigiEhD5zHSw6nRXyFtAEV1B_XSjGhTpThYwnTkivgydOf9tZA8nV6H56w",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "818 Stewart St, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6155264,
               "lng" : -122.3359752
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61682887989272,
                  "lng" : -122.3346895201073
               },
               "southwest" : {
                  "lat" : 47.61412922010727,
                  "lng" : -122.3373891798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "5a972bfecd5b0df3477193e71919b6a2e30f9cbb",
         "name" : "Specialty's Cafe & Bakery",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 4032,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/114129336542113263507/photos\"\u003eDiana Esteves\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAEhNb_kHmul03nZPKCKGiajY5qFl3YT3TrUV-93NC5wj4oO8ZZNZMSGzXg8xD5pzFfLr5vlFnj61ARfEkf27zOCPeijr5fKP2e1u07p7IMOLIhg5jSufm2cbIV9PFWKPkEhCtGX5yyFQQOUWZDwg0Caw8GhQXi_aR1wA7BjzGQjLEQiTidr7S5Q",
               "width" : 3024
            }
         ],
         "place_id" : "ChIJ5fMbXkoVkFQRac1DmYO6JpM",
         "rating" : 3.8,
         "reference" : "CmRbAAAAKCbYNHoc4cWjsfIanjjcAUAAHYUW88B6QBhlEz3bZjkl-CMzVxbV1gJLgNV14PkfsL-uUv2pItFd9OAKctvjXzuaYOWgKunDm9k3rFN23ZZSc0-pTtv5E-2gWhm_XITYEhALB637BU6l7aWoUSmTEMuFGhRFSt9vchbmq8eY__eghbPslMKYfg",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "1918 8th Ave, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6272609,
               "lng" : -122.342628
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62861022989271,
                  "lng" : -122.3411249701073
               },
               "southwest" : {
                  "lat" : 47.62591057010727,
                  "lng" : -122.3438246298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "8db48cd2beaf02b4a8bb97b62246565a011ea8e6",
         "name" : "Herkimer Coffee",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/117453751448974090039/photos\"\u003eSam Ling\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAkb1H0bzh6StgoUd0a1XOH8p9hXDkJw2RcJl717Ns6JBblAEXNpfM4R3EPar9VqlTWU4Akv-teBcOjdYxbJuNhw203I2vb0t9hGpJ6ELbCRvIDC60opWQZonvV4C6da9NEhAxnd8lkbSAnvtFoemeq9MFGhSzmNFPFuhipdmNQF40EwkXJlPJMw",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJZduL0j4VkFQR-7mU6agKJDQ",
         "rating" : 4.6,
         "reference" : "CmRbAAAA_R1wHGqXqFm7OKiq4HeV156PLUUoeJpGA8cH01a4MUgND1rHdFPcc4qc5WomYuON4VnrL_w7zOFbggq8B_lTzCXv89CUEswmTb9Curq9rsMqK3gdVmaw24yWwqGerGEEEhA0Ag5EH644dvktBBqGFXjUGhRYbeoSiOeMyQTl89_atW7N27yNrQ",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "901 Dexter Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.626755,
               "lng" : -122.347695
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62810447989272,
                  "lng" : -122.3462785701073
               },
               "southwest" : {
                  "lat" : 47.62540482010727,
                  "lng" : -122.3489782298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "dd73ebb0e5e949a8d97f085b54ea177cf1e5c95c",
         "name" : "Caffe Vita",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 4048,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/114559901943389767289/photos\"\u003eSanjay Shah\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAMtcEj3cL5xM-dQAuf-MAtfFzlPr1pQl9zFOrACdiiIpq1BJ1JQejt6M-eVwj6qI6sx3Wb7b0qbvlnW_jq-KqL2-tVsJW3IUrlF2rZP52_e0YF08_qFvQOCwDlMbqnfmsEhATJuMkR31ZxEPsZWnsxX41GhQOAq0SzsWm7_qwON3UJE0yB4-tlg",
               "width" : 3036
            }
         ],
         "place_id" : "ChIJLXOSXz8VkFQRYN_ttFy3X8s",
         "price_level" : 1,
         "rating" : 4.5,
         "reference" : "CmRbAAAAkDv-3dOsiABpn10a6mOXkm59c3Es43ALRRMimfl355DHV6EMf50HjH2rzulatUOvVBfxrot6D6BzmSs23RG9blh4C8r8R65IMu4gJRWT639gyedBTN2cy5ZrKTkOvD-oEhDzUKf-UJUgljCIAOLrxCaYGhQuLKfiJcczwB2vnButbhb4iEV3Hw",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "813 5th Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.61357719999999,
               "lng" : -122.3355838
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61487132989271,
                  "lng" : -122.3341822701072
               },
               "southwest" : {
                  "lat" : 47.61217167010727,
                  "lng" : -122.3368819298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "acd46099bea043d0b78bb8f63272a4084917a3e8",
         "name" : "Caffe Senso Unico",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3036,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/111977541039028264588/photos\"\u003eShaghayegh Shariat\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAiIC2v66OQFBqayRkOsFceDX2x6_XTmyyl96nOBpDrAUQDQbO6GOHhR3LrhQ_A3L8lXuKdCor1S2wPvAYK92B7GwA68VaapczIaEgtro4v8hhp9HA9h-zRUTDQ2AbocjrEhASmirgQYVPIOoi0sEaGtPmGhRbTPsIdzHuge9qSlzPlRMzvsemyg",
               "width" : 4048
            }
         ],
         "place_id" : "ChIJvwKi10oVkFQR6XaZSD_r2wA",
         "price_level" : 1,
         "rating" : 4.8,
         "reference" : "CmRbAAAAvBf38hP2-Ojyz2racOmUUB-jHdQ-EfA9BSf_LeSGUsQoaSS0ce6cLfrCWvrIkjznZuRTBBIZRqcv4cGnJJQ0ZTLmPOMgbud3I0Qtpa-IINlMgz6oyjdxcZdvvWIo1L-DEhCZOTMn-QFC3hNsmBISDKLHGhRfAOxJ5ZDQKLTystffHgKJOvZhqA",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "restaurant", "food", "point_of_interest", "establishment" ],
         "vicinity" : "622 Olive Way, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6222793,
               "lng" : -122.3339992
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62362907989272,
                  "lng" : -122.3328063201073
               },
               "southwest" : {
                  "lat" : 47.62092942010727,
                  "lng" : -122.3355059798928
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "75eca1ee699810755ebe88d3b56fde6fdfeae7a0",
         "name" : "Caffe Ladro - South Lake Union Fairview",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/101562299255057667228/photos\"\u003eChristophe CHARPENTIER\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA_rOceiO4Ud3a6Sj3mxE-puyLKe7dDSJaI7qd6dfeedy4KSSkngLeWpeu5BOblFGVw6bV6-gXyQXnCn0S2HqtqCzsqrAizD06x_qc-qSp-yH2VfvQvkmKJ7SLIOdjkJg_EhCRgHt8lEdhB0mBq349YzwMGhSNZtzGnBPPonXvPoV5S0ZN239ggQ",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJVaEoOzcVkFQRuv3X7USdip0",
         "rating" : 4.6,
         "reference" : "CmRbAAAAqZ6hDfIzkj_bYvvsN0vBujozip356FckK6a9IhDEfNE1B9M5LCh-BlJUCmfW51T9iygdWCxh_n7WwUgVQiN4o3o1PrxxcGEZh9d36oX62E9sUcL9SpiCpYqIRODNsWvYEhABgW6q7Q5x4x3x8Bvl7jo-GhQvvVQ7XqAAV0qUPj1b8jpRo8vTxQ",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "400 Fairview Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6253517,
               "lng" : -122.3565136
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62670167989271,
                  "lng" : -122.3552604701073
               },
               "southwest" : {
                  "lat" : 47.62400202010727,
                  "lng" : -122.3579601298928
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "f9fc128752ac98e5ff08e526d268b174da5ce351",
         "name" : "Caffe Ladro - Lower Queen Anne",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/118016434443850466525/photos\"\u003eRaghunandan Rao\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAm_jjwSdki34vn-CPdCmSpZF3PCtuR5QGtdBJvM3zUTJt1H96jwSlp-PrqRXC264QEdWdXXI9FbUFkgdi0cnGhziAi2DKsYnpWBqcrmcRDYE2HB9bSr5UnAFZU_8fPkkpEhBkxl_xq4vfcF-vtPCpYVC4GhTn-ywLjQcHmLsP6DkM8bz5-gA1tQ",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJr_LSz0MVkFQRMqUoqHwlu00",
         "price_level" : 1,
         "rating" : 4.4,
         "reference" : "CmRbAAAAd5tPWEaj2ha9ui5DRIdT5WZ9n_ZrgnKGnA6yWcb3yD2mr9UnrDREWusT2pDATTZOrrPFesHPqwUlDO5aj2il-88mEuj4_rRnuhtfkTQXkU7ABmZ5rTUnl--SFO0P4HEKEhBbV-Hp19h28EIcsGS8iA4_GhTPEkJlFF_RcL6B3DkUGb0xqLy0Tw",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "600 Queen Anne Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.615292,
               "lng" : -122.3333319
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61654612989273,
                  "lng" : -122.3321093201073
               },
               "southwest" : {
                  "lat" : 47.61384647010728,
                  "lng" : -122.3348089798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "5c54d5cb058018dcd2595d5335f6014aad064842",
         "name" : "Caffe Ladro - 1800 9th at Howell",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 1515,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/105552070869018848756/photos\"\u003eP. E. McKee\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAhLgh5Z_pudqierLVspfRhKQXNBNoSIVeFpq90v1ZAZgH8M2xLrDzbolWfp6vr3yKOCRFsNVycWT9_oSIQ_gH0LmBjZsBP2Tv0u8KB4baDVxASKqx5eKujg2WqKxWEMTOEhDlyJIajwuzHjCN96wu5KmMGhQCrowPvsyv-NzQtvFitU8uA0CO4g",
               "width" : 2268
            }
         ],
         "place_id" : "ChIJh4vnnUoVkFQRlKP4go2C2aY",
         "rating" : 4.1,
         "reference" : "CmRbAAAAGPKqqZdKG3sR7ERg6J9oxPOfaOI9P5kBbr07yzj6WBRVbEXKtG-zFzZPvfVCn8XrK3BObTxvPwoJYVIb5uv1rqt0Tl7HmEsc5Qz3nAK3C8bkBNfYIrBdS_cO8Yx78FzjEhCNLIb2lUgMqIKWWLuUcts5GhRNu8cZm7FbxSCRAtRKqYIgpQusdQ",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "1800 9th Ave, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6172573,
               "lng" : -122.3494879
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61867187989272,
                  "lng" : -122.3480542201073
               },
               "southwest" : {
                  "lat" : 47.61597222010727,
                  "lng" : -122.3507538798928
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "c906e98257961b48e149ec5746f7f8e91aeb8b8d",
         "name" : "Street Bean Coffee Roasters",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 1233,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/112001413933824738173/photos\"\u003eStreet Bean Coffee Roasters\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAaRzVxS10Z9WY3cu7zvzPjfJBT2gCdd9jmWaDd4JdUIl9IKUM1JvoZTfUI8T-CeZkbsnprEKYBMsZo3aSduVfu6WuvYeglV5Gl91Fq5eoMcxfmYxFRRkJRZBafD0El3X5EhA_6rW5FnPMG3h1kJAPygCcGhQQvKOGYftrqpQN1TowtnFAS1T5eQ",
               "width" : 2048
            }
         ],
         "place_id" : "ChIJ3X6BA08VkFQRqC7NsOPY5Ps",
         "rating" : 4.7,
         "reference" : "CmRbAAAALguLBjspBPr103DajJpn4nN4MbaJEJQlP4eMAg1MFrZWWW8NK6BFGPillHJd0oPhWnyqhpSepg6aVCY5X6DtqGqWiP1N4GmIEkPmchVaqLnaQYiXrHsrJWp_1ewMIH1fEhDP3pac1bPDBbGjrw9HUGHfGhSB8Bp8uF-bPb0F0PvO2JEoyZArnA",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "2711 3rd Ave, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6225892,
               "lng" : -122.3386749
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62393937989273,
                  "lng" : -122.3372082201073
               },
               "southwest" : {
                  "lat" : 47.62123972010728,
                  "lng" : -122.3399078798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "115a24c1bcaf08ea2e3c99fa34ab300f7f97a069",
         "name" : "kakao",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 607,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/100795793143727734273/photos\"\u003ekakao\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAe89rbqL7aTpr_5kmMadwlWJZQ3Kxvr15lIL-XcPdKt6SBmvx8GK4dDcCruvaidcZJZV2fXwa857kyLxdJYvwncak2WZr5riV1wWyHpl5nlhkSl6fDUbtZ5nyNnDGxyXUEhBMcpxTmB9VXCO8u7dbYcAHGhT65iZAP-O1BwBONELUZhEHZlOCeQ",
               "width" : 1080
            }
         ],
         "place_id" : "ChIJ9T_ghTcVkFQRnT4RsXF36Cs",
         "rating" : 4.6,
         "reference" : "CmRbAAAAuhzm6wRg6VKrB-KgrWdtO7ujRWcJgk1vo4gsuHDhlaqo8zTwKSCq04dcX4fUt9Q_jN10hkeof3VwDJnOVBxkcQpJud2-kUaDAO8QbmuNYXSW0OxMI0hxyImoenGj6HtfEhBEftwnPPc1cHv3l-SNjhjhGhSsoTiSz6wHjAzhfZvexP6lbCX2FA",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "415 Westlake Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6382644,
               "lng" : -122.3567966
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.63955832989272,
                  "lng" : -122.3555185701073
               },
               "southwest" : {
                  "lat" : 47.63685867010727,
                  "lng" : -122.3582182298928
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "5e3d5b8fe232ebdd245c53d7017e8bb419e2a28d",
         "name" : "Storyville Coffee Queen Anne",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3036,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/112267908482108664983/photos\"\u003eTyler DuMez\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAiphcwPtQ6j5EcwcJFahH1uN8jBe-j6-R5vOct4lasyDqTwYmClANtjZn4HjHdelixOuSKprWzkZpFbKw64FXlp4V05HiYxAeuJJRtuqerniAKk7IsMZfk4q_FrH9k3VXEhBDAGgKP3NFGnhY3dPtfcU-GhThA0AWT52-hAcCA00gMGhYukNa_g",
               "width" : 4048
            }
         ],
         "place_id" : "ChIJO2_aZRIVkFQRgRwytGfQ00g",
         "rating" : 4.7,
         "reference" : "CmRbAAAA6UZvoDn-cMmdjV-cLcRMeQG53UaN9gKPRBt4Js3NWxcBPKF0zDnSe6DNmK43TYKI8vqieG4rLcQwNsmoDhZEumaoeZrzUna_0ywPFMWQpIy2_Vqd2bJ6vryZ5oGhmMpgEhDWC5WdRzjLLkAfAz-ncPUjGhQAuXnFpi2C0tG5r-xudaolJfTuBA",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "2128 Queen Anne Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.620173,
               "lng" : -122.3362562
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62152157989271,
                  "lng" : -122.3347065201073
               },
               "southwest" : {
                  "lat" : 47.61882192010727,
                  "lng" : -122.3374061798928
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "76b424bc26e8634a2964bc58999b71269708597d",
         "name" : "Rococo Coffee Roasting",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3024,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/105877892124929952379/photos\"\u003eJon L\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA2JSoEQFRZ4KJ_6C96KgccFKNikVxRE3flDhdY-R6yevw8IyKbsG07l1HOuCNZceVeIA53wLjMvIYWuLYI6bTLpGH0UmifRD3piTls7ybOW9r2dIgbCcR3vT4QLg_sk-QEhCSZGzRvarSbAOhFTKMu42UGhR2BY82Gh60lIGXi4f5Em-DXp6GMw",
               "width" : 4032
            }
         ],
         "place_id" : "ChIJja6LRTYVkFQRAimRJX2E3mY",
         "rating" : 4.3,
         "reference" : "CmRbAAAAeSWajA2PDdizKaaE_PWGff_CqcyCI3t4PjO0TigZ6bMMhNDU0fYBQ_YFPBNvjPP1a34undrS7OoN-V0ItuFmHDIs763lARAPIEPhjgTG-3dwokiTs_cYREUaehsBtwijEhAvj8ukaC5DUFJw0xD2KDJ5GhScipFse4K8pdD3wJo-cIIQABnJzA",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "207 Boren Ave N, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6155907,
               "lng" : -122.3375792
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.61692987989272,
                  "lng" : -122.3363889201073
               },
               "southwest" : {
                  "lat" : 47.61423022010727,
                  "lng" : -122.3390885798927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "44d558c9e7c382d3a2c4c0cbe9b7bc8a29907ca3",
         "name" : "Café Suisse",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 3120,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/101673199232465184973/photos\"\u003eCraig Crossley\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAAS9411t40zq5fijTXCxhrId4vS2DKE1LAeSXleD0l0fpj30AfZ_X32HQl-MilxplHsrh9XnyyFPWQ7SPOlE9Kq7MuTqjv1cAVvMhUUur3lCEkIe32b1VHQm6wMXZgs9PnEhD0XjuhenILR4BZKUK_nPhLGhSn076BPOKzEHAjrqx9oDbEKxMlBQ",
               "width" : 4160
            }
         ],
         "place_id" : "ChIJWxfqUUoVkFQRvTliTrInMU8",
         "rating" : 4.6,
         "reference" : "CmRbAAAALnTk23bIAZYW2F9dpsfUoB--5hGpX9nRzkWtg-4s8S84dlHn1wqK6-BOHx8pr6PqtxjAm_WymxeD4EqLS4Ulm5PPpM3aaib7pqDo9Z4xS6tlXJmi4_c2fm1tKl7YtP1-EhBcDvHyN06bcJSqcPXkH6OQGhQJKsTAs1brxA6523b4DpGjVM2azw",
         "scope" : "GOOGLE",
         "types" : [ "cafe", "store", "food", "point_of_interest", "establishment" ],
         "vicinity" : "2008 Westlake Ave, Seattle"
      },
      {
         "geometry" : {
            "location" : {
               "lat" : 47.6232848,
               "lng" : -122.3340793
            },
            "viewport" : {
               "northeast" : {
                  "lat" : 47.62463262989272,
                  "lng" : -122.3328554701073
               },
               "southwest" : {
                  "lat" : 47.62193297010727,
                  "lng" : -122.3355551298927
               }
            }
         },
         "icon" : "https://maps.gstatic.com/mapfiles/place_api/icons/cafe-71.png",
         "id" : "6e8f5f4fe779ddaa85760e20dfde0fd1846cbf2b",
         "name" : "Cherry Street Coffee (Fairview & Republican)",
         "opening_hours" : {
            "open_now" : false,
            "weekday_text" : []
         },
         "photos" : [
            {
               "height" : 1944,
               "html_attributions" : [
                  "\u003ca href=\"https://maps.google.com/maps/contrib/101219086902132570797/photos\"\u003eSam Hassan\u003c/a\u003e"
               ],
               "photo_reference" : "CmRaAAAA1ZpBu0HaPe8OiItCNKvRv4Gu8xn67Dtmc2yH0yE74UICPh4UkhUF8hTfWy3-8cfqQMjh0hMnoNykckeSCWQ20ZluFZQBRAmEQlTl817Fsc-68iFfOdIs-mjOhrY3SO7SEhA7HalxrtfoTeycX40FyRO5GhTcyxl29xOvDk9hWSTFnE2ssL04_g",
               "width" : 2592
            }
         ],
         "place_id" : "ChIJY4_FTDcVkFQRMZohJXhfGZc",
         "rating" : 4.4,
         "reference" : "CmRbAAAAIRPH3DtwlTG-LYeJh37NGiINlZ4YWV1sIf6xv9Nb0eFcatXCzWT_RP-G0nk32di6ZE7z3_62U4cN1MM03xfyDQdyXjJKy0dNeFKBsvFrWBbyj1ZGwsG5PVoJbhStuJEBEhBx_cpR77HlPaUPT46_xAGqGhQLpreQWpEt4ohGzWREXl2YKPLhvw",
         "scope" : "GOOGLE",
         "types" : [
            "cafe",
            "bakery",
            "store",
            "restaurant",
            "food",
            "point_of_interest",
            "establishment"
         ],
         "vicinity" : "500 Fairview Ave N, Seattle"
      }
   ],
   "status" : "OK"
}

```