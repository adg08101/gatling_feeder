package tabacuba;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class editemployee extends Simulation {

  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://erptest.avangenio.net")
      .inferHtmlResources(AllowList(), DenyList())
      .acceptHeader("application/json")
      .acceptEncodingHeader("gzip, deflate")
      .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:96.0) Gecko/20100101 Firefox/96.0");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "same-origin");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_1.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_1.put("Origin", "https://erptest.avangenio.net");
    headers_1.put("Sec-Fetch-Dest", "empty");
    headers_1.put("Sec-Fetch-Mode", "cors");
    headers_1.put("Sec-Fetch-Site", "same-origin");
    headers_1.put("X-Frappe-CMD", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled");
    headers_1.put("X-Frappe-CSRF-Token", "None");
    headers_1.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_2 = new HashMap<>();
    headers_2.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_2.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_2.put("Origin", "https://erptest.avangenio.net");
    headers_2.put("Sec-Fetch-Dest", "empty");
    headers_2.put("Sec-Fetch-Mode", "cors");
    headers_2.put("Sec-Fetch-Site", "same-origin");
    headers_2.put("X-Frappe-CMD", "login");
    headers_2.put("X-Frappe-CSRF-Token", "None");
    headers_2.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("Accept", "*/*");
    headers_4.put("Sec-Fetch-Dest", "empty");
    headers_4.put("Sec-Fetch-Mode", "cors");
    headers_4.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_5 = new HashMap<>();
    headers_5.put("Origin", "https://erptest.avangenio.net");
    headers_5.put("Sec-Fetch-Dest", "empty");
    headers_5.put("Sec-Fetch-Mode", "cors");
    headers_5.put("Sec-Fetch-Site", "same-origin");
    headers_5.put("X-Frappe-CMD", "");
    headers_5.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_5.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_7.put("Origin", "https://erptest.avangenio.net");
    headers_7.put("Sec-Fetch-Dest", "empty");
    headers_7.put("Sec-Fetch-Mode", "cors");
    headers_7.put("Sec-Fetch-Site", "same-origin");
    headers_7.put("X-Frappe-CMD", "");
    headers_7.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_7.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_9 = new HashMap<>();
    headers_9.put("Sec-Fetch-Dest", "empty");
    headers_9.put("Sec-Fetch-Mode", "cors");
    headers_9.put("Sec-Fetch-Site", "same-origin");
    headers_9.put("X-Frappe-CMD", "");
    headers_9.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_9.put("X-Frappe-Doctype", "Notification%20Log");
    headers_9.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("Sec-Fetch-Dest", "empty");
    headers_10.put("Sec-Fetch-Mode", "cors");
    headers_10.put("Sec-Fetch-Site", "same-origin");
    headers_10.put("X-Frappe-CMD", "");
    headers_10.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_10.put("X-Frappe-Doctype", "Dashboard%20Settings");
    headers_10.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("Sec-Fetch-Dest", "empty");
    headers_11.put("Sec-Fetch-Mode", "cors");
    headers_11.put("Sec-Fetch-Site", "same-origin");
    headers_11.put("X-Frappe-CMD", "");
    headers_11.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_11.put("X-Frappe-Doctype", "Employee");
    headers_11.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_12.put("Origin", "https://erptest.avangenio.net");
    headers_12.put("Sec-Fetch-Dest", "empty");
    headers_12.put("Sec-Fetch-Mode", "cors");
    headers_12.put("Sec-Fetch-Site", "same-origin");
    headers_12.put("X-Frappe-CMD", "");
    headers_12.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_12.put("X-Frappe-Doctype", "Employee");
    headers_12.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("Sec-Fetch-Dest", "empty");
    headers_13.put("Sec-Fetch-Mode", "cors");
    headers_13.put("Sec-Fetch-Site", "same-origin");
    headers_13.put("X-Frappe-CMD", "");
    headers_13.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_13.put("X-Frappe-Doctype", "List%20Filter");
    headers_13.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("Accept", "*/*");
    headers_18.put("Content-type", "text/plain;charset=UTF-8");
    headers_18.put("Origin", "https://erptest.avangenio.net");
    headers_18.put("Sec-Fetch-Dest", "empty");
    headers_18.put("Sec-Fetch-Mode", "cors");
    headers_18.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_24 = new HashMap<>();
    headers_24.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_24.put("Origin", "https://erptest.avangenio.net");
    headers_24.put("Sec-Fetch-Dest", "empty");
    headers_24.put("Sec-Fetch-Mode", "cors");
    headers_24.put("Sec-Fetch-Site", "same-origin");
    headers_24.put("X-Frappe-CMD", "");
    headers_24.put("X-Frappe-CSRF-Token", "d13472e368d61c691782d109f7448f52990f243c211ce2a46c5634c2");
    headers_24.put("X-Frappe-Doctype", "Salutation");
    headers_24.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_37 = new HashMap<>();
    headers_37.put("Accept", "*/*");
    headers_37.put("Sec-Fetch-Dest", "script");
    headers_37.put("Sec-Fetch-Mode", "no-cors");
    headers_37.put("Sec-Fetch-Site", "same-origin");

    FeederBuilder.Batchable<String> users =
            csv("users.csv").queue();

    FeederBuilder.Batchable<String> employees =
            csv("employees.csv").random();

    ScenarioBuilder editemployee = scenario("editemployee")
      // login
      .feed(users)
      .feed(employees)
      .exec(
        http("request_0")
          .get("/login")
          .headers(headers_0)
          .resources(
            http("request_1")
              .post("/")
              .headers(headers_1)
              .formParam("cmd", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled")
          )
      )
      .pause(2)
      .exec(
        http("request_2")
          .post("/")
          .headers(headers_2)
          .formParam("cmd", "login")
          .formParam("usr", "#{username}")
          .formParam("pwd", "#{password}")
          .formParam("device", "desktop")
          .resources(
            http("request_3")
              .get("/app")
              .headers(headers_0),
            http("request_4")
              .get("/socket.io/?EIO=3&transport=polling&t=Nxh37ee")
              .headers(headers_4),
            http("request_5")
              .post("/api/method/frappe.core.doctype.user_permission.user_permission.get_user_permissions")
              .headers(headers_5),
            http("request_6")
              .post("/api/method/frappe.desk.doctype.tag.tag.get_tags_list_for_awesomebar")
              .headers(headers_5),
            http("request_7")
              .post("/api/method/frappe.desk.desktop.get_desktop_page")
              .headers(headers_7)
              .formParam("page", "Home"),
            http("request_8")
              .post("/api/method/frappe.desk.doctype.event.event.get_events")
              .headers(headers_7)
              .formParam("start", "2022-02-11")
              .formParam("end", "2022-02-11"),
            http("request_9")
              .get("/api/method/frappe.desk.reportview.get_list?fields=%5B%22*%22%5D&limit=20&order_by=creation+desc&doctype=Notification+Log&_=1644620970104")
              .headers(headers_9),
            http("request_10")
              .get("/api/method/frappe.desk.reportview.get_list?filters=%7B%22name%22%3A%22#{user}%40#{domain}%22%7D&fields=%5B%22*%22%5D&doctype=Dashboard+Settings&limit=20&_=1644620970105")
              .headers(headers_10)
          )
      )
      .pause(2)
      // editemployee
      .exec(
        http("request_11")
          .get("/api/method/frappe.desk.form.load.getdoctype?doctype=Employee&with_parent=1&cached_timestamp=2021-06-17+11%3A31%3A37.730760&_=1644620970106")
          .headers(headers_11)
          .resources(
            http("request_12")
              .post("/api/method/frappe.desk.listview.get_list_settings")
              .headers(headers_12)
              .formParam("doctype", "Employee"),
            http("request_13")
              .get("/api/method/frappe.desk.reportview.get_list?fields=%5B%22name%22%2C%22filter_name%22%2C%22for_user%22%2C%22filters%22%5D&filters=%7B%22reference_doctype%22%3A%22Employee%22%7D&or_filters=%5B%5B%22for_user%22%2C%22%3D%22%2C%22#{user}%40#{domain}%22%5D%2C%5B%22for_user%22%2C%22%3D%22%2C%22%22%5D%5D&doctype=List+Filter&limit=20&_=1644620970107")
              .headers(headers_13),
            http("request_14")
              .post("/api/method/frappe.desk.reportview.get")
              .headers(headers_12)
              .formParam("doctype", "Employee")
              .formParam("fields", "[\"`tabEmployee`.`name`\",\"`tabEmployee`.`owner`\",\"`tabEmployee`.`creation`\",\"`tabEmployee`.`modified`\",\"`tabEmployee`.`modified_by`\",\"`tabEmployee`.`_user_tags`\",\"`tabEmployee`.`_comments`\",\"`tabEmployee`.`_assign`\",\"`tabEmployee`.`_liked_by`\",\"`tabEmployee`.`docstatus`\",\"`tabEmployee`.`parent`\",\"`tabEmployee`.`parenttype`\",\"`tabEmployee`.`parentfield`\",\"`tabEmployee`.`idx`\",\"`tabEmployee`.`employee_name`\",\"`tabEmployee`.`status`\",\"`tabEmployee`.`designation`\",\"`tabEmployee`.`image`\",\"`tabEmployee`.`branch`\",\"`tabEmployee`.`department`\"]")
              .formParam("filters", "[[\"Employee\",\"status\",\"=\",\"Active\"]]")
              .formParam("order_by", "`tabEmployee`.`modified` desc")
              .formParam("start", "0")
              .formParam("page_length", "20")
              .formParam("view", "List")
              .formParam("group_by", "`tabEmployee`.`name`")
              .formParam("with_comment_count", "true"),
            http("request_15")
              .post("/api/method/frappe.desk.reportview.get_count")
              .headers(headers_12)
              .formParam("doctype", "Employee")
              .formParam("filters", "[[\"Employee\",\"status\",\"=\",\"Active\"]]")
              .formParam("fields", "[]")
              .formParam("distinct", "false"),
            http("request_16")
              .get("/api/method/frappe.desk.reportview.get_sidebar_stats?stats=%5B%22_user_tags%22%5D&doctype=Employee&filters=%5B%5B%22Employee%22%2C%22status%22%2C%22%3D%22%2C%22Active%22%5D%5D&_=1644620970108")
              .headers(headers_11)
          )
      )
      .pause(2)
      .exec(
        http("request_17")
          .get("/api/method/frappe.desk.form.load.getdoc?doctype=Employee&name=HR-EMP-00001&_=1644620970109")
          .headers(headers_11)
          .resources(
            http("request_18")
              .post("/socket.io/?EIO=3&transport=polling&t=Nxh3D8l&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_18)
              .body(RawFileBody("tabacuba/editemployee/0018_request.html")),
            http("request_19")
              .get("/api/method/frappe.desk.notifications.get_open_count?doctype=Employee&name=HR-EMP-00001&items=%5B%22Attendance%22%2C%22Attendance+Request%22%2C%22Employee+Checkin%22%2C%22Leave+Application%22%2C%22Leave+Allocation%22%2C%22Leave+Policy+Assignment%22%2C%22Employee+Transfer%22%2C%22Employee+Promotion%22%2C%22Employee+Separation%22%2C%22Employee+Grievance%22%2C%22Shift+Request%22%2C%22Shift+Assignment%22%2C%22Expense+Claim%22%2C%22Travel+Request%22%2C%22Employee+Advance%22%2C%22Employee+Benefit+Application%22%2C%22Employee+Benefit+Claim%22%2C%22Salary+Structure+Assignment%22%2C%22Salary+Slip%22%2C%22Additional+Salary%22%2C%22Timesheet%22%2C%22Employee+Incentive%22%2C%22Retention+Bonus%22%2C%22Bank+Account%22%2C%22Training+Event%22%2C%22Training+Result%22%2C%22Training+Feedback%22%2C%22Employee+Skill+Map%22%2C%22Appraisal%22%5D&_=1644620970110")
              .headers(headers_11),
            http("request_20")
              .post("/socket.io/?EIO=3&transport=polling&t=Nxh3DDW&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_18)
              .body(RawFileBody("tabacuba/editemployee/0020_request.html")),
            http("request_21")
              .post("/api/method/frappe.desk.doctype.route_history.route_history.deferred_insert")
              .headers(headers_7)
              .formParam("routes", "[{\"creation\":\"2022-02-11 18:09:43\",\"route\":\"List/Employee/List\"}]"),
            http("request_22")
              .get("/socket.io/?EIO=3&transport=polling&t=Nxh37i5&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_4),
            http("request_23")
              .post("/socket.io/?EIO=3&transport=polling&t=Nxh3Dol&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_18)
              .body(RawFileBody("tabacuba/editemployee/0023_request.html"))
          )
      )
      .pause(2)
      .exec(
        http("request_24")
          .post("/api/method/frappe.desk.search.search_link")
          .headers(headers_24)
          .formParam("txt", "")
          .formParam("doctype", "Salutation")
          .formParam("ignore_user_permissions", "0")
          .formParam("reference_doctype", "Employee")
      )
      .pause(2)
      .exec(
        http("request_25")
          .post("/api/method/frappe.desk.search.search_link")
          .headers(headers_24)
          .formParam("txt", "Hola mundo")
          .formParam("doctype", "Salutation")
          .formParam("ignore_user_permissions", "0")
          .formParam("reference_doctype", "Employee")
      )
      .pause(2)
      .exec(
        http("request_26")
          .post("/socket.io/?EIO=3&transport=polling&t=Nxh3Jwe&sid=P6knVSL1kcokXKGFAACs")
          .headers(headers_18)
          .body(RawFileBody("tabacuba/editemployee/0026_request.html"))
          .resources(
            http("request_27")
              .get("/socket.io/?EIO=3&transport=polling&t=Nxh3Dpp&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_4),
            http("request_28")
              .post("/api/method/frappe.client.validate_link")
              .headers(headers_24)
              .formParam("doctype", "Salutation")
              .formParam("docname", "#{gender}")
              .formParam("fields", "[]")
          )
      )
      .pause(2)
      .exec(
        http("request_29")
          .post("/api/method/erpnext.hr.doctype.employee.employee.get_retirement_date")
          .headers(headers_7)
          .formParam("date_of_birth", "#{birth}")
      )
      .pause(2)
      .exec(
        http("request_30")
          .post("/socket.io/?EIO=3&transport=polling&t=Nxh3Q2P&sid=P6knVSL1kcokXKGFAACs")
          .headers(headers_18)
          .body(RawFileBody("tabacuba/editemployee/0030_request.html"))
          .resources(
            http("request_31")
              .get("/socket.io/?EIO=3&transport=polling&t=Nxh3JxW&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_4)
          )
      )
      .pause(2)
      .exec(
        http("request_32")
          .post("/api/method/frappe.desk.form.save.savedocs")
          .headers(headers_7)
          .formParam("doc", "{\"name\":\"HR-EMP-00001\",\"owner\":\"#{username}\",\"creation\":\"2022-02-10 07:46:04.659185\",\"modified\":\"2022-02-10 07:46:04.659185\",\"modified_by\":\"#{username}\",\"idx\":0,\"docstatus\":0,\"employee\":\"HR-EMP-00001\",\"naming_series\":\"HR-EMP-\",\"first_name\":\"John\",\"last_name\":\"Doe\",\"employee_name\":\"John Doe\",\"company\":\"Taqba\",\"status\":\"Active\",\"gender\":\"Male\",\"date_of_birth\":\"2000-12-01\",\"date_of_joining\":\"2022-02-28\",\"create_user_permission\":1,\"notice_number_of_days\":0,\"date_of_retirement\":\"2060-12-01\",\"salary_mode\":\"\",\"unsubscribed\":0,\"permanent_accommodation_type\":\"\",\"prefered_contact_email\":\"\",\"current_accommodation_type\":\"\",\"marital_status\":\"\",\"blood_group\":\"\",\"leave_encashed\":\"\",\"lft\":1,\"rgt\":2,\"old_parent\":\"\",\"doctype\":\"Employee\",\"education\":[],\"external_work_history\":[],\"internal_work_history\":[],\"__last_sync_on\":\"2022-02-11T23:09:52.913Z\",\"middle_name\":\"#{lastname}\",\"__unsaved\":1,\"salutation\":null}")
          .formParam("action", "Save")
          .resources(
            http("request_33")
              .get("/api/method/frappe.desk.notifications.get_open_count?doctype=Employee&name=HR-EMP-00001&items=%5B%22Attendance%22%2C%22Attendance+Request%22%2C%22Employee+Checkin%22%2C%22Leave+Application%22%2C%22Leave+Allocation%22%2C%22Leave+Policy+Assignment%22%2C%22Employee+Transfer%22%2C%22Employee+Promotion%22%2C%22Employee+Separation%22%2C%22Employee+Grievance%22%2C%22Shift+Request%22%2C%22Shift+Assignment%22%2C%22Expense+Claim%22%2C%22Travel+Request%22%2C%22Employee+Advance%22%2C%22Employee+Benefit+Application%22%2C%22Employee+Benefit+Claim%22%2C%22Salary+Structure+Assignment%22%2C%22Salary+Slip%22%2C%22Additional+Salary%22%2C%22Timesheet%22%2C%22Employee+Incentive%22%2C%22Retention+Bonus%22%2C%22Bank+Account%22%2C%22Training+Event%22%2C%22Training+Result%22%2C%22Training+Feedback%22%2C%22Employee+Skill+Map%22%2C%22Appraisal%22%5D&_=1644620970111")
              .headers(headers_11)
          )
      )
      .pause(2)
      // logout
      .exec(
        http("request_34")
          .post("/api/method/logout")
          .headers(headers_5)
          .resources(
            http("request_35")
              .post("/socket.io/?EIO=3&transport=polling&t=Nxh3UM-&sid=P6knVSL1kcokXKGFAACs")
              .headers(headers_18)
              .body(RawFileBody("tabacuba/editemployee/0035_request.json"))
              .check(status().is(400)),
            http("request_36")
              .get("/")
              .headers(headers_0),
            http("request_37")
              .get("/website_script.js?ver=1642771902.0")
              .headers(headers_37),
            http("request_38")
              .post("/")
              .headers(headers_1)
              .formParam("cmd", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled")
          )
      );

    setUp(editemployee.injectOpen(rampUsers(4).during(3)).protocols(httpProtocol));
  }
}
