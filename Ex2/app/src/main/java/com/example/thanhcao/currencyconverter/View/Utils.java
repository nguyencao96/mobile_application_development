package com.example.thanhcao.currencyconverter.View;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.thanhcao.currencyconverter.Model.Country;
import com.google.gson.Gson;

public class Utils {
    public static void initialExchangeRate(Activity activity){
        SharedPreferences appSharedPrefs = PreferenceManager.getDefaultSharedPreferences(activity);
        SharedPreferences.Editor prefsEditor = appSharedPrefs.edit();
        Gson gson = new Gson();
        prefsEditor.putString("AED", gson.toJson(new Country("UAE dirham","AED", 4.513254)));
        prefsEditor.putString("AFN", gson.toJson(new Country("Afghan afghani","AFN", 85.892909)));
        prefsEditor.putString("ALL", gson.toJson(new Country("Albanian lek","ALL", 128.962236)));
        prefsEditor.putString("AMD", gson.toJson(new Country("Armenian dram","AMD", 589.429311)));
        prefsEditor.putString("ANG", gson.toJson(new Country("Netherlands Antillean guilder","ANG", 2.187754)));
        prefsEditor.putString("AOA", gson.toJson(new Country("Angolan kwanza","AOA", 265.801065)));
        prefsEditor.putString("ARS", gson.toJson(new Country("Argentine peso","ARS", 24.787293)));
        prefsEditor.putString("AWG", gson.toJson(new Country("Aruban florin", "AWG", 2.187259)));
        prefsEditor.putString("AZN", gson.toJson(new Country("Azerbaijan manat", "AZN", 2.088346)));
        prefsEditor.putString("BBD", gson.toJson(new Country("Barbadian dollar", "BBD", 2.457594)));
        prefsEditor.putString("BDT", gson.toJson(new Country("Bangladeshi taka", "BDT", 101.940993)));
        prefsEditor.putString("BGN", gson.toJson(new Country("Bulgarian lev", "BGN", 1.952441)));
        prefsEditor.putString("BHD", gson.toJson(new Country("Bahraini dinar", "BHD", 0.463139)));
        prefsEditor.putString("BIF", gson.toJson(new Country("Burundi franc", "BIF", 2151.598853)));
        prefsEditor.putString("BMD", gson.toJson(new Country("Bermudian dollar", "BMD", 1.228797)));
        prefsEditor.putString("BND", gson.toJson(new Country("Brunei dollar", "BND", 1.601742)));
        prefsEditor.putString("BOB", gson.toJson(new Country("Bolivian boliviano", "BOB", 8.430038)));
        prefsEditor.putString("BRL", gson.toJson(new Country("Brazilian real", "BRL", 4.19352)));
        prefsEditor.putString("BSD", gson.toJson(new Country("Bahamian dollar", "BSD", 1.228797)));
        prefsEditor.putString("BTN", gson.toJson(new Country("Bhutanese ngultrum", "BTN", 80.63985)));
        prefsEditor.putString("BWP", gson.toJson(new Country("Botswana pula", "BWP", 11.809235)));
        prefsEditor.putString("BYN", gson.toJson(new Country("Belarusian ruble", "BYN", 2.45804)));
        prefsEditor.putString("BZD", gson.toJson(new Country("Belize dollar", "BZD", 2.454896)));
        prefsEditor.putString("CAD", gson.toJson(new Country("Canadian dollar", "CAD", 1.568196)));
        prefsEditor.putString("CDF", gson.toJson(new Country("Congolese franc", "CDF", 1923.686437)));
        prefsEditor.putString("CHF", gson.toJson(new Country("Swiss franc", "CHF", 1.197451)));
        prefsEditor.putString("CLP", gson.toJson(new Country("Chilean peso", "CLP", 732.608754)));
        prefsEditor.putString("CNY", gson.toJson(new Country("Chinese Yuan Renminbi", "CNY", 7.734545)));
        prefsEditor.putString("COP", gson.toJson(new Country("Colombian peso", "COP", 3388.77628)));
        prefsEditor.putString("CRC", gson.toJson(new Country("Costa Rican colon", "CRC", 689.974283)));
        prefsEditor.putString("CUP", gson.toJson(new Country("Cuban peso", "CUP", 32.563119)));
        prefsEditor.putString("CVE", gson.toJson(new Country("Cape Verdean escudo", "CVE", 110.272236)));
        prefsEditor.putString("CZK", gson.toJson(new Country("Czech koruna", "CZK", 25.332877)));
        prefsEditor.putString("DJF", gson.toJson(new Country("Djiboutian franc", "DJF", 217.288167)));
        prefsEditor.putString("DKK", gson.toJson(new Country("Danish krone", "DKK", 7.446584)));
        prefsEditor.putString("DOP", gson.toJson(new Country("Dominican peso", "DOP", 60.71534)));
        prefsEditor.putString("DZD", gson.toJson(new Country("Algerian dinar", "DZD", 139.900986)));
        prefsEditor.putString("EGP", gson.toJson(new Country("Egyptian pound", "EGP", 21.701037)));
        prefsEditor.putString("ERN", gson.toJson(new Country("Eritrean nakfa", "ERN", 18.420148)));
        prefsEditor.putString("ETB", gson.toJson(new Country("Ethiopian birr", "ETB", 33.423278)));
        prefsEditor.putString("EUR", gson.toJson(new Country("European euro", "EUR", 1)));
        prefsEditor.putString("FJD", gson.toJson(new Country("Fijian dollar", "FJD", 2.485247)));
        prefsEditor.putString("FKP", gson.toJson(new Country("Falkland Islands pound", "FKP", 0.876383)));
        prefsEditor.putString("GBP", gson.toJson(new Country("Pound sterling", "GBP", 0.877546)));
        prefsEditor.putString("GEL", gson.toJson(new Country("Georgian lari", "GEL", 2.979961)));
        prefsEditor.putString("GGP", gson.toJson(new Country("Guernsey Pound", "GGP", 0.877555)));
        prefsEditor.putString("GHS", gson.toJson(new Country("Ghanaian cedi", "GHS", 5.441732)));
        prefsEditor.putString("GIP", gson.toJson(new Country("Gibraltar pound", "GIP", 0.876629)));
        prefsEditor.putString("GMD", gson.toJson(new Country("Gambian dalasi", "GMD", 57.593712)));
        prefsEditor.putString("GNF", gson.toJson(new Country("Guinean franc", "GNF", 11059.172959)));
        prefsEditor.putString("GTQ", gson.toJson(new Country("Guatemalan quetzal", "GTQ", 9.014504)));
        prefsEditor.putString("GYD", gson.toJson(new Country("Guyanese dollar", "GYD", 252.997002)));
        prefsEditor.putString("HKD", gson.toJson(new Country("Hong Kong dollar", "HKD", 9.637091)));
        prefsEditor.putString("HNL", gson.toJson(new Country("Honduran lempira", "HNL", 28.952963)));
        prefsEditor.putString("HRK", gson.toJson(new Country("Croatian kuna", "HRK", 7.405473)));
        prefsEditor.putString("HTG", gson.toJson(new Country("Haitian gourde", "HTG", 79.023929)));
        prefsEditor.putString("HUF", gson.toJson(new Country("Hungarian forint", "HUF", 310.516985)));
        prefsEditor.putString("IDR", gson.toJson(new Country("Indonesian rupiah", "IDR", 17047.100044)));
        prefsEditor.putString("ILS", gson.toJson(new Country("Israeli new shekel", "ILS", 4.330777)));
        prefsEditor.putString("IMP", gson.toJson(new Country("Manx pound", "IMP", 0.877555)));
        prefsEditor.putString("INR", gson.toJson(new Country("Indian rupee", "INR", 81.345125)));
        prefsEditor.putString("IQD", gson.toJson(new Country("Iraqi dinar", "IQD", 1454.895585)));
        prefsEditor.putString("IRR", gson.toJson(new Country("Iranian rial", "IRR", 51609.472201)));
        prefsEditor.putString("ISK", gson.toJson(new Country("Icelandic krona", "ISK", 123.064017)));
        prefsEditor.putString("JEP", gson.toJson(new Country("Jersey pound", "JEP", 0.877555)));
        prefsEditor.putString("JMD", gson.toJson(new Country("Jamaican dollar", "JMD", 152.125066)));
        prefsEditor.putString("JOD", gson.toJson(new Country("Jordanian dinar", "JOD", 0.869379)));
        prefsEditor.putString("JPY", gson.toJson(new Country("Japanese yen", "JPY", 132.276309)));
        prefsEditor.putString("KES", gson.toJson(new Country("Kenyan shilling", "KES", 122.633939)));
        prefsEditor.putString("KGS", gson.toJson(new Country("Kyrgyzstani som", "KGS", 84.249396)));
        prefsEditor.putString("KHR", gson.toJson(new Country("Cambodian riel", "KHR", 4911.501827)));
        prefsEditor.putString("KMF", gson.toJson(new Country("Comorian franc", "KMF", 490.314544)));
        prefsEditor.putString("KPW", gson.toJson(new Country("North Korean won", "KPW", 1105.917683)));
        prefsEditor.putString("KRW", gson.toJson(new Country("South Korean won", "KRW", 1314.321185)));
        prefsEditor.putString("KWD", gson.toJson(new Country("Kuwaiti dinar", "KWD", 0.368767)));
        prefsEditor.putString("KYD", gson.toJson(new Country("Cayman Islands dollar", "KYD", 1.008084)));
        prefsEditor.putString("KZT", gson.toJson(new Country("Kazakhstani tenge", "KZT", 401.091616)));
        prefsEditor.putString("LAK", gson.toJson(new Country("Lao kip", "LAK", 10173.210352)));
        prefsEditor.putString("LBP", gson.toJson(new Country("Lebanese pound", "LBP", 1849.339834)));
        prefsEditor.putString("LKR", gson.toJson(new Country("Sri Lankan rupee", "LKR", 192.060966)));
        prefsEditor.putString("LRD", gson.toJson(new Country("Liberian dollar", "LRD", 160.456308)));
        prefsEditor.putString("LSL", gson.toJson(new Country("Lesotho loti", "LSL", 14.856624)));
        prefsEditor.putString("LYD", gson.toJson(new Country("Libyan dinar", "LYD", 1.626809)));
        prefsEditor.putString("MAD", gson.toJson(new Country("Moroccan dirham", "MAD", 11.297607)));
        prefsEditor.putString("MDL", gson.toJson(new Country("Moldovan leu", "MDL", 20.137572)));
        prefsEditor.putString("MGA", gson.toJson(new Country("Malagasy ariary", "MGA", 3901.430733)));
        prefsEditor.putString("MKD", gson.toJson(new Country("Macedonian denar", "MKD", 61.230954)));
        prefsEditor.putString("MMK", gson.toJson(new Country("Myanmar kyat", "MMK", 1620.783599)));
        prefsEditor.putString("MNT", gson.toJson(new Country("Mongolian tugrik", "MNT", 2933.138738)));
        prefsEditor.putString("MOP", gson.toJson(new Country("Macanese pataca", "MOP", 9.92721)));
        prefsEditor.putString("MUR", gson.toJson(new Country("Mauritian rupee", "MUR", 41.103259)));
        prefsEditor.putString("MVR", gson.toJson(new Country("Maldivian rufiyaa", "MVR", 18.682311)));
        prefsEditor.putString("MWK", gson.toJson(new Country("Malawian kwacha", "MWK", 878.958441)));
        prefsEditor.putString("MXN", gson.toJson(new Country("Mexican peso", "MXN", 22.756089)));
        prefsEditor.putString("MYR", gson.toJson(new Country("Malaysian ringgit", "MYR", 4.786212)));
        prefsEditor.putString("MZN", gson.toJson(new Country("Mozambican metical", "MZN", 73.346889)));
        prefsEditor.putString("NAD", gson.toJson(new Country("Namibian dollar", "NAD", 14.853745)));
        prefsEditor.putString("NGN", gson.toJson(new Country("Nigerian naira", "NGN", 441.138527)));
        prefsEditor.putString("NIO", gson.toJson(new Country("Nicaraguan cordoba", "NIO", 38.093128)));
        prefsEditor.putString("NOK", gson.toJson(new Country("Norwegian krone", "NOK", 9.612515)));
        prefsEditor.putString("NPR", gson.toJson(new Country("Nepalese rupee", "NPR", 129.864417)));
        prefsEditor.putString("NZD", gson.toJson(new Country("New Zealand dollar", "NZD", 1.704469)));
        prefsEditor.putString("OMR", gson.toJson(new Country("Omani rial", "OMR", 0.472846)));
        prefsEditor.putString("PEN", gson.toJson(new Country("Peruvian sol", "PEN", 3.951079)));
        prefsEditor.putString("PGK", gson.toJson(new Country("Papua New Guinean kina", "PGK", 3.910651)));
        prefsEditor.putString("PHP", gson.toJson(new Country("Philippine peso", "PHP", 64.057186)));
        prefsEditor.putString("PKR", gson.toJson(new Country("Pakistani rupee", "PKR", 141.930598)));
        prefsEditor.putString("PLN", gson.toJson(new Country("Polish zloty", "PLN", 4.172016)));
        prefsEditor.putString("PYG", gson.toJson(new Country("Paraguayan guarani", "PYG", 6779.273175)));
        prefsEditor.putString("QAR", gson.toJson(new Country("Qatari riyal", "QAR", 4.474423)));
        prefsEditor.putString("RON", gson.toJson(new Country("Romanian leu", "RON", 4.659234)));
        prefsEditor.putString("RSD", gson.toJson(new Country("Serbian dinar", "RSD", 117.310171)));
        prefsEditor.putString("RUB", gson.toJson(new Country("Russian ruble", "RUB", 75.41864)));
        prefsEditor.putString("RWF", gson.toJson(new Country("Rwandan franc", "RWF", 1039.328743)));
        prefsEditor.putString("SAR", gson.toJson(new Country("Saudi Arabian riyal", "SAR", 4.60787)));
        prefsEditor.putString("SBD", gson.toJson(new Country("Solomon Islands dollar", "SBD", 9.559554)));
        prefsEditor.putString("SCR", gson.toJson(new Country("Seychellois rupee", "SCR", 16.5032)));
        prefsEditor.putString("SDG", gson.toJson(new Country("Sudanese pound", "SDG", 22.181261)));
        prefsEditor.putString("SEK", gson.toJson(new Country("Swedish krona", "SEK", 10.377237)));
        prefsEditor.putString("SGD", gson.toJson(new Country("Singapore dollar", "SGD", 1.615381)));
        prefsEditor.putString("SHP", gson.toJson(new Country("Saint Helena pound", "SHP", 0.876629)));
        prefsEditor.putString("SLL", gson.toJson(new Country("Sierra Leonean leone", "SLL", 9375.721121)));
        prefsEditor.putString("SOS", gson.toJson(new Country("Somali shilling", "SOS", 691.813097)));
        prefsEditor.putString("SRD", gson.toJson(new Country("Surinamese dollar", "SRD", 9.118129)));
        prefsEditor.putString("SYP", gson.toJson(new Country("Syrian pound", "SYP", 632.805828)));
        prefsEditor.putString("SZL", gson.toJson(new Country("Swazi lilangeni", "SZL", 14.87152)));
        prefsEditor.putString("THB", gson.toJson(new Country("Thai baht", "THB", 38.486374)));
        prefsEditor.putString("TJS", gson.toJson(new Country("Tajikistani somoni", "TJS", 10.889645)));
        prefsEditor.putString("TMT", gson.toJson(new Country("Turkmen manat", "TMT", 4.17791)));
        prefsEditor.putString("TND", gson.toJson(new Country("Tunisian dinar", "TND", 2.961854)));
        prefsEditor.putString("TOP", gson.toJson(new Country("Tongan pa’anga", "TOP", 2.746489)));
        prefsEditor.putString("TRY", gson.toJson(new Country("Turkish lira", "TRY", 5.00809)));
        prefsEditor.putString("TTD", gson.toJson(new Country("Trinidad and Tobago dollar", "TTD", 8.288855)));
        prefsEditor.putString("TWD", gson.toJson(new Country("New Taiwan dollar", "TWD", 36.18684)));
        prefsEditor.putString("TZS", gson.toJson(new Country("Tanzanian shilling", "TZS", 2796.742263)));
        prefsEditor.putString("UAH", gson.toJson(new Country("Ukrainian hryvnia", "UAH", 32.133492)));
        prefsEditor.putString("UGX", gson.toJson(new Country("Ugandan shilling", "UGX", 4527.256652)));
        prefsEditor.putString("USD", gson.toJson(new Country("United States dollar", "USD", 1.228797)));
        prefsEditor.putString("UYU", gson.toJson(new Country("Uruguayan peso", "UYU", 34.603373)));
        prefsEditor.putString("UZS", gson.toJson(new Country("Uzbekistani som", "UZS", 9897.959818)));
        prefsEditor.putString("VEF", gson.toJson(new Country("Venezuelan bolivar", "VEF", 72930.328004)));
        prefsEditor.putString("VND", gson.toJson(new Country("Vietnamese dong", "VND", 27979.70648)));
        prefsEditor.putString("VUV", gson.toJson(new Country("Vanuatu vatu", "VUV", 128.851649)));
        prefsEditor.putString("WST", gson.toJson(new Country("Samoan tala", "WST", 3.104683)));
        prefsEditor.putString("XAF", gson.toJson(new Country("Central African CFA franc", "XAF", 655.354297)));
        prefsEditor.putString("XCD", gson.toJson(new Country("East Caribbean dollar", "XCD", 3.322183)));
        prefsEditor.putString("XDR", gson.toJson(new Country("SDR (Special Drawing Right)", "XDR", 0.846521)));
        prefsEditor.putString("XOF", gson.toJson(new Country("West African CFA franc", "XOF", 655.354297)));
        prefsEditor.putString("XPF", gson.toJson(new Country("CFP franc", "XPF", 119.342414)));
        prefsEditor.putString("YER", gson.toJson(new Country("Yemeni rial", "YER", 307.07635)));
        prefsEditor.putString("ZAR", gson.toJson(new Country("South African rand", "ZAR", 14.853579)));
        prefsEditor.putString("ZMW", gson.toJson(new Country("Zambian kwacha", "ZMW", 11.588002)));
        prefsEditor.commit();
    }
}