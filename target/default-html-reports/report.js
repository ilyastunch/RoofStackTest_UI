$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/task.feature");
formatter.feature({
  "name": "RoofStack Task",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "UI Task Steps",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Google’a \u0027Roof Stack Yazılım\u0027 şeklinde arama yapılır.",
  "keyword": "Given "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.google_a_şeklinde_arama_yapılır(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sonuçlar listesinden https://roofstacks.com adresine girilir.",
  "keyword": "When "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.sonuçlar_listesinden_https_roofstacks_com_adresine_girilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Kariyer sayfasına gidilir.",
  "keyword": "Then "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.kariyer_sayfasına_gidilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "İlanlar arasından Product pozisyonu seçilir.",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.i̇lanlar_arasından_Product_pozisyonu_seçilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lead Product Tester seçilir.",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.lead_Product_Tester_seçilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Lead Product Tester sayfasında sayfanın gelip gelmediği, doğruluğu kontrol edilir.",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.lead_Product_Tester_sayfasında_sayfanın_gelip_gelmediği_doğruluğu_kontrol_edilir()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "SendCV butonuna basarak bir dosya upload edelim",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.sendcv_butonuna_basarak_bir_dosya_upload_edelim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Eposta adresine e-mail adresinizi girelim",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.eposta_adresine_e_mail_adresinizi_girelim()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Sample bir dosya yükleyelim ve upload butonuna basarak dosyayı paylaşalım",
  "keyword": "And "
});
formatter.match({
  "location": "com.roofstack.step_definitions.TaskDefs.sample_bir_dosya_yükleyelim_ve_upload_butonuna_basarak_dosyayı_paylaşalım()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});