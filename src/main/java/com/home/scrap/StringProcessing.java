package com.home.scrap;

public class StringProcessing
{
  public static void main(String[] args)
  {
    String before = "-Ddataproviderthreadcount=40 -Dthreadcount=40 -DautomationProperties=\"{'':'','pcc.jenkins.build.url':'${BUILD_URL}','pcc.qtf.check_javascript.fail_test':'${failOnJavaScriptError}'}\" -Dtestngxml=FM_InstitutionalClaimsUBResidentARBillSetup_Sanity.xml,FM_ProfessionalClaims1500_Sanity.xml,FM_InstitutionalClaimsUBEditsUBPicklists_Sanity.xml,FM_InstitutionalClaimsUB_Sanity.xml,FM_InstitutionalClaimsUBNoPayBills_Sanity.xml";
    System.out.println(before);
    String[] splitThem = before.split("-D");
    for (String str: splitThem)
    {
      if(str.startsWith("testngxml")){
        System.out.println(str.substring(str.indexOf("=")+1));
      }
//
    }
  }
}
