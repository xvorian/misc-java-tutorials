package com.home.common;

import com.home.lambda.misc.model.EmployeeDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProjectConstants
{
  private ProjectConstants(){}
  public static String buildURL ="https://azure-testautomation.pointclickcare.com/view/PCCCoreWeb%20-%20Automation/job/Care%20Mgt%20-%20Orders/job/Azure%20Master/job/Coda%20-%20CM_IMM_ORDER_UPDATES";
  public static String sentence = "A Quick Brown Fox Jumps Over Lazy Dog";
  public static String[] countriesName = new String[] { "Afghanistan", "Albania", "Algeria",
      "American Samoa",
      "Andorra", "Angola", "Anguilla", "Antarctica", "Antigua and Barbuda", "Argentina", "Armenia",
      "Aruba", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados",
      "Belarus", "Belgium", "Belize", "Benin", "Bermuda", "Bhutan", "Bolivia",
      "Bosnia and Herzegowina", "Botswana", "Bouvet Island", "Brazil",
      "British Indian Ocean Territory", "Brunei Darussalam", "Bulgaria", "Burkina Faso", "Burundi",
      "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic",
      "Chad", "Chile", "China", "Christmas Island", "Cocos (Keeling) Islands", "Colombia",
      "Comoros", "Congo", "Congo, the Democratic Republic of the", "Cook Islands", "Costa Rica",
      "Cote d'Ivoire", "Croatia (Hrvatska)", "Cuba", "Cyprus", "Czech Republic", "Denmark",
      "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador",
      "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Falkland Islands (Malvinas)",
      "Faroe Islands", "Fiji", "Finland", "France", "France Metropolitan", "French Guiana",
      "French Polynesia", "French Southern Territories", "Gabon", "Gambia", "Georgia", "Germany",
      "Ghana", "Gibraltar", "Greece", "Greenland", "Grenada", "Guadeloupe", "Guam", "Guatemala",
      "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Heard and Mc Donald Islands",
      "Holy See (Vatican City State)", "Honduras", "Hong Kong", "Hungary", "Iceland", "India",
      "Indonesia", "Iran (Islamic Republic of)", "Iraq", "Ireland", "Israel", "Italy", "Jamaica",
      "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati",
      "Korea, Democratic People's Republic of", "Korea, Republic of", "Kuwait", "Kyrgyzstan",
      "Lao, People's Democratic Republic", "Latvia", "Lebanon", "Lesotho", "Liberia",
      "Libyan Arab Jamahiriya", "Liechtenstein", "Lithuania", "Luxembourg", "Macau",
      "Macedonia, The Former Yugoslav Republic of", "Madagascar", "Malawi", "Malaysia", "Maldives",
      "Mali", "Malta", "Marshall Islands", "Martinique", "Mauritania", "Mauritius", "Mayotte",
      "Mexico", "Micronesia, Federated States of", "Moldova, Republic of", "Monaco", "Mongolia",
      "Montserrat", "Morocco", "Mozambique", "Myanmar", "Namibia", "Nauru", "Nepal", "Netherlands",
      "Netherlands Antilles", "New Caledonia", "New Zealand", "Nicaragua", "Niger", "Nigeria",
      "Niue", "Norfolk Island", "Northern Mariana Islands", "Norway", "Oman", "Pakistan", "Palau",
      "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Pitcairn", "Poland",
      "Portugal", "Puerto Rico", "Qatar", "Reunion", "Romania", "Russian Federation", "Rwanda",
      "Saint Kitts and Nevis", "Saint Lucia", "Saint Vincent and the Grenadines", "Samoa",
      "San Marino", "Sao Tome and Principe", "Saudi Arabia", "Senegal", "Seychelles",
      "Sierra Leone", "Singapore", "Slovakia (Slovak Republic)", "Slovenia", "Solomon Islands",
      "Somalia", "South Africa", "South Georgia and the South Sandwich Islands", "Spain",
      "Sri Lanka", "St. Helena", "St. Pierre and Miquelon", "Sudan", "Suriname",
      "Svalbard and Jan Mayen Islands", "Swaziland", "Sweden", "Switzerland",
      "Syrian Arab Republic", "Taiwan, Province of China", "Tajikistan",
      "Tanzania, United Republic of", "Thailand", "Togo", "Tokelau", "Tonga", "Trinidad and Tobago",
      "Tunisia", "Turkey", "Turkmenistan", "Turks and Caicos Islands", "Tuvalu", "Uganda",
      "Ukraine", "United Arab Emirates", "United Kingdom", "United States",
      "United States Minor Outlying Islands", "Uruguay", "Uzbekistan", "Vanuatu", "Venezuela",
      "Vietnam", "Virgin Islands (British)", "Virgin Islands (U.S.)", "Wallis and Futuna Islands",
      "Western Sahara", "Yemen", "Yugoslavia", "Zambia", "Zimbabwe", "Palestine" };

  public static String[][] personDetails = new String[][] {{"id","1"},{"name","Amjad Hanif"},{"age","25"},{"salary","50000"},{"email","amjad.hanif@gmail.com"}};
  public  static List<EmployeeDetails> employeeList = new ArrayList<EmployeeDetails>(){{
    add(new EmployeeDetails("1","Amir",80000,"Operations",false));
    add(new EmployeeDetails("2","Amjad",100000,"Director",true));
    add(new EmployeeDetails("3","Fahad",200000,"Director",true));
    add(new EmployeeDetails("4","Ayan",50000,"Sales",true));
  }};

  public static Integer[] returnRandomNumbers(int size,int min, int max)
  {
    Integer[] result = new Integer[size];
    for (int i = 0; i < size; i++)
    {
      result[i] = ThreadLocalRandom.current().nextInt(min, max+1);
    }
    return result;
  }

  public static String getRandomString(int length, boolean specialCharacter)
  {
    StringBuffer buf = new StringBuffer();

    String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";
    int spLen = specialChars.length();
    Random r = new Random();
    boolean specialCharPicked = false;

    for (int i = 0; i < length; i++)
    {
      if (specialCharacter && ((i == length - 1 && specialCharPicked == false) || r.nextBoolean()))
      {
        buf.append(specialChars.charAt(r.nextInt(spLen)));
        specialCharPicked = true;
      }
      else
      {
        buf.append(getRandomLetter());

      }
    }
    return buf.toString();
  }

  public static String getRandomLetter()
  {
    Random r = new Random();
    char c = (char) (r.nextInt(26) + 'a');
    return Character.toString(c);
  }
}
