package tabacuba;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class addemployee extends Simulation {

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
    headers_0.put("Cache-Control", "max-age=0");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "none");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_1.put("Cache-Control", "max-age=0");
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
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_3.put("Sec-Fetch-Dest", "document");
    headers_3.put("Sec-Fetch-Mode", "navigate");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    headers_3.put("Sec-Fetch-User", "?1");
    headers_3.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("Accept", "*/*");
    headers_4.put("Sec-Fetch-Dest", "empty");
    headers_4.put("Sec-Fetch-Mode", "cors");
    headers_4.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_5 = new HashMap<>();
    headers_5.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_5.put("Origin", "https://erptest.avangenio.net");
    headers_5.put("Sec-Fetch-Dest", "empty");
    headers_5.put("Sec-Fetch-Mode", "cors");
    headers_5.put("Sec-Fetch-Site", "same-origin");
    headers_5.put("X-Frappe-CMD", "");
    headers_5.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_5.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("Origin", "https://erptest.avangenio.net");
    headers_6.put("Sec-Fetch-Dest", "empty");
    headers_6.put("Sec-Fetch-Mode", "cors");
    headers_6.put("Sec-Fetch-Site", "same-origin");
    headers_6.put("X-Frappe-CMD", "");
    headers_6.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_6.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_7 = new HashMap<>();
    headers_7.put("Sec-Fetch-Dest", "empty");
    headers_7.put("Sec-Fetch-Mode", "cors");
    headers_7.put("Sec-Fetch-Site", "same-origin");
    headers_7.put("X-Frappe-CMD", "");
    headers_7.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_7.put("X-Frappe-Doctype", "Notification%20Log");
    headers_7.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_10 = new HashMap<>();
    headers_10.put("Sec-Fetch-Dest", "empty");
    headers_10.put("Sec-Fetch-Mode", "cors");
    headers_10.put("Sec-Fetch-Site", "same-origin");
    headers_10.put("X-Frappe-CMD", "");
    headers_10.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_10.put("X-Frappe-Doctype", "Dashboard%20Settings");
    headers_10.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("Sec-Fetch-Dest", "empty");
    headers_11.put("Sec-Fetch-Mode", "cors");
    headers_11.put("Sec-Fetch-Site", "same-origin");
    headers_11.put("X-Frappe-CMD", "");
    headers_11.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_11.put("X-Frappe-Doctype", "Employee");
    headers_11.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_12 = new HashMap<>();
    headers_12.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_12.put("Origin", "https://erptest.avangenio.net");
    headers_12.put("Sec-Fetch-Dest", "empty");
    headers_12.put("Sec-Fetch-Mode", "cors");
    headers_12.put("Sec-Fetch-Site", "same-origin");
    headers_12.put("X-Frappe-CMD", "");
    headers_12.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_12.put("X-Frappe-Doctype", "Employee");
    headers_12.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_13 = new HashMap<>();
    headers_13.put("Sec-Fetch-Dest", "empty");
    headers_13.put("Sec-Fetch-Mode", "cors");
    headers_13.put("Sec-Fetch-Site", "same-origin");
    headers_13.put("X-Frappe-CMD", "");
    headers_13.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_13.put("X-Frappe-Doctype", "List%20Filter");
    headers_13.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_14 = new HashMap<>();
    headers_14.put("Accept", "image/avif,image/webp,*/*");
    headers_14.put("Sec-Fetch-Dest", "image");
    headers_14.put("Sec-Fetch-Mode", "no-cors");
    headers_14.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_19 = new HashMap<>();
    headers_19.put("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8");
    headers_19.put("Accept-Encoding", "identity");
    headers_19.put("Sec-Fetch-Dest", "font");
    headers_19.put("Sec-Fetch-Mode", "cors");
    headers_19.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("Accept", "*/*");
    headers_21.put("Content-type", "text/plain;charset=UTF-8");
    headers_21.put("Origin", "https://erptest.avangenio.net");
    headers_21.put("Sec-Fetch-Dest", "empty");
    headers_21.put("Sec-Fetch-Mode", "cors");
    headers_21.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_23 = new HashMap<>();
    headers_23.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_23.put("Origin", "https://erptest.avangenio.net");
    headers_23.put("Sec-Fetch-Dest", "empty");
    headers_23.put("Sec-Fetch-Mode", "cors");
    headers_23.put("Sec-Fetch-Site", "same-origin");
    headers_23.put("X-Frappe-CMD", "");
    headers_23.put("X-Frappe-CSRF-Token", "c77df10a622b4b7e6c862e5af27ef7b9b28d5a663107cf5d4f2f0a2a");
    headers_23.put("X-Frappe-Doctype", "Gender");
    headers_23.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_38 = new HashMap<>();
    headers_38.put("Accept", "*/*");
    headers_38.put("Sec-Fetch-Dest", "script");
    headers_38.put("Sec-Fetch-Mode", "no-cors");
    headers_38.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_39 = new HashMap<>();
    headers_39.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_39.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_39.put("Origin", "https://erptest.avangenio.net");
    headers_39.put("Sec-Fetch-Dest", "empty");
    headers_39.put("Sec-Fetch-Mode", "cors");
    headers_39.put("Sec-Fetch-Site", "same-origin");
    headers_39.put("X-Frappe-CMD", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled");
    headers_39.put("X-Frappe-CSRF-Token", "None");
    headers_39.put("X-Requested-With", "XMLHttpRequest");

    FeederBuilder.Batchable<String> users =
            csv("users.csv").queue();

    FeederBuilder.Batchable<String> employees =
            csv("employees.csv").random();

    ScenarioBuilder addemployee = scenario("addemployee")
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
              .headers(headers_3),
            http("request_4")
              .get("/socket.io/?EIO=3&transport=polling&t=NxgxM6S")
              .headers(headers_4),
            http("request_5")
              .post("/api/method/frappe.desk.doctype.event.event.get_events")
              .headers(headers_5)
              .formParam("start", "2022-02-11")
              .formParam("end", "2022-02-11"),
            http("request_6")
              .post("/api/method/frappe.core.doctype.user_permission.user_permission.get_user_permissions")
              .headers(headers_6),
            http("request_7")
              .get("/api/method/frappe.desk.reportview.get_list?fields=%5B%22*%22%5D&limit=20&order_by=creation+desc&doctype=Notification+Log&_=1644618932174")
              .headers(headers_7),
            http("request_8")
              .post("/api/method/frappe.desk.desktop.get_desktop_page")
              .headers(headers_5)
              .formParam("page", "Home"),
            http("request_9")
              .post("/api/method/frappe.desk.doctype.tag.tag.get_tags_list_for_awesomebar")
              .headers(headers_6),
            http("request_10")
              .get("/api/method/frappe.desk.reportview.get_list?filters=%7B%22name%22%3A%22#{user}%40#{domain}%22%7D&fields=%5B%22*%22%5D&doctype=Dashboard+Settings&limit=20&_=1644618932175")
              .headers(headers_10)
          )
      )
      .pause(2)
      // addemployee
      .exec(
        http("request_11")
          .get("/api/method/frappe.desk.form.load.getdoctype?doctype=Employee&with_parent=1&cached_timestamp=&_=1644618932176")
          .headers(headers_11)
          .resources(
            http("request_12")
              .post("/api/method/frappe.desk.listview.get_list_settings")
              .headers(headers_12)
              .formParam("doctype", "Employee"),
            http("request_13")
              .get("/api/method/frappe.desk.reportview.get_list?fields=%5B%22name%22%2C%22filter_name%22%2C%22for_user%22%2C%22filters%22%5D&filters=%7B%22reference_doctype%22%3A%22Employee%22%7D&or_filters=%5B%5B%22for_user%22%2C%22%3D%22%2C%22#{user}%40#{domain}%22%5D%2C%5B%22for_user%22%2C%22%3D%22%2C%22%22%5D%5D&doctype=List+Filter&limit=20&_=1644618932177")
              .headers(headers_13),
            http("request_14")
              .get("/assets/frappe/images/ui-states/list-empty-state.svg")
              .headers(headers_14),
            http("request_15")
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
            http("request_16")
              .get("/api/method/frappe.desk.reportview.get_sidebar_stats?stats=%5B%22_user_tags%22%5D&doctype=Employee&filters=%5B%5B%22Employee%22%2C%22status%22%2C%22%3D%22%2C%22Active%22%5D%5D&_=1644618932178")
              .headers(headers_11),
            http("request_17")
              .post("/api/method/frappe.desk.reportview.get_count")
              .headers(headers_12)
              .formParam("doctype", "Employee")
              .formParam("filters", "[[\"Employee\",\"status\",\"=\",\"Active\"]]")
              .formParam("fields", "[]")
              .formParam("distinct", "false")
          )
      )
      .pause(2)
      .exec(
        http("request_18")
          .get("/assets/frappe/images/ui-states/grid-empty-state.svg")
          .headers(headers_14)
          .resources(
            http("request_19")
              .get("/assets/frappe/css/fonts/inter/inter_italic.woff2")
              .headers(headers_19),
            http("request_20")
              .get("/socket.io/?EIO=3&transport=polling&t=NxgxMIz&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_4),
            http("request_21")
              .post("/socket.io/?EIO=3&transport=polling&t=NxgxSPq&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_21)
              .body(RawFileBody("tabacuba/addemployee/0021_request.html"))
          )
      )
      .pause(2)
      .exec(
        http("request_22")
          .post("/api/method/frappe.desk.doctype.route_history.route_history.deferred_insert")
          .headers(headers_5)
          .formParam("routes", "[{\"creation\":\"2022-02-11 17:35:51\",\"route\":\"List/Employee/List\"}]")
      )
      .pause(2)
      .exec(
        http("request_23")
          .post("/api/method/frappe.desk.search.search_link")
          .headers(headers_23)
          .formParam("txt", "")
          .formParam("doctype", "Gender")
          .formParam("ignore_user_permissions", "0")
          .formParam("reference_doctype", "Employee")
          .resources(
            http("request_24")
              .get("/assets/frappe/css/fonts/fontawesome/fontawesome-webfont.woff2?v=4.7.0")
              .headers(headers_19)
          )
      )
      .pause(2)
      .exec(
        http("request_25")
          .post("/api/method/frappe.client.validate_link")
          .headers(headers_23)
          .formParam("doctype", "Gender")
          .formParam("docname", "Non-Conforming")
          .formParam("fields", "[]")
      )
      .pause(2)
      .exec(
        http("request_26")
          .post("/api/method/erpnext.hr.doctype.employee.employee.get_retirement_date")
          .headers(headers_5)
          .formParam("date_of_birth", "2022-02-01")
      )
      .pause(2)
      .exec(
        http("request_27")
          .post("/api/method/frappe.desk.form.save.savedocs")
          .headers(headers_5)
          .formParam("doc", "{\"docstatus\":0,\"doctype\":\"Employee\",\"name\":\"new-employee-1\",\"__islocal\":1,\"__unsaved\":1,\"owner\":\"#{user}@#{domain}\",\"naming_series\":\"HR-EMP-\",\"company\":\"Taqba\",\"status\":\"Active\",\"create_user_permission\":1,\"salary_mode\":\"\",\"unsubscribed\":0,\"permanent_accommodation_type\":\"\",\"prefered_contact_email\":\"\",\"current_accommodation_type\":\"\",\"marital_status\":\"\",\"blood_group\":\"\",\"leave_encashed\":\"\",\"first_name\":\"#{name}\",\"gender\":\"Non-Conforming\",\"date_of_birth\":\"2022-02-01\",\"date_of_retirement\":\"2082-02-01\",\"date_of_joining\":\"2022-02-28\"}")
          .formParam("action", "Save")
          .resources(
            http("request_28")
              .get("/api/method/frappe.desk.form.load.getdoc?doctype=Employee&name=HR-EMP-00003&_=1644618932179")
              .headers(headers_11),
            http("request_29")
              .post("/socket.io/?EIO=3&transport=polling&t=NxgxY03&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_21)
              .body(RawFileBody("tabacuba/addemployee/0029_request.html")),
            http("request_30")
              .post("/socket.io/?EIO=3&transport=polling&t=NxgxYB0&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_21)
              .body(RawFileBody("tabacuba/addemployee/0030_request.html")),
            http("request_31")
              .get("/api/method/frappe.desk.notifications.get_open_count?doctype=Employee&name=HR-EMP-00003&items=%5B%22Attendance%22%2C%22Attendance+Request%22%2C%22Employee+Checkin%22%2C%22Leave+Application%22%2C%22Leave+Allocation%22%2C%22Leave+Policy+Assignment%22%2C%22Employee+Transfer%22%2C%22Employee+Promotion%22%2C%22Employee+Separation%22%2C%22Employee+Grievance%22%2C%22Shift+Request%22%2C%22Shift+Assignment%22%2C%22Expense+Claim%22%2C%22Travel+Request%22%2C%22Employee+Advance%22%2C%22Employee+Benefit+Application%22%2C%22Employee+Benefit+Claim%22%2C%22Salary+Structure+Assignment%22%2C%22Salary+Slip%22%2C%22Additional+Salary%22%2C%22Timesheet%22%2C%22Employee+Incentive%22%2C%22Retention+Bonus%22%2C%22Bank+Account%22%2C%22Training+Event%22%2C%22Training+Result%22%2C%22Training+Feedback%22%2C%22Employee+Skill+Map%22%2C%22Appraisal%22%5D&_=1644618932180")
              .headers(headers_11),
            http("request_32")
              .get("/api/method/frappe.desk.notifications.get_open_count?doctype=Employee&name=HR-EMP-00003&items=%5B%22Attendance%22%2C%22Attendance+Request%22%2C%22Employee+Checkin%22%2C%22Leave+Application%22%2C%22Leave+Allocation%22%2C%22Leave+Policy+Assignment%22%2C%22Employee+Transfer%22%2C%22Employee+Promotion%22%2C%22Employee+Separation%22%2C%22Employee+Grievance%22%2C%22Shift+Request%22%2C%22Shift+Assignment%22%2C%22Expense+Claim%22%2C%22Travel+Request%22%2C%22Employee+Advance%22%2C%22Employee+Benefit+Application%22%2C%22Employee+Benefit+Claim%22%2C%22Salary+Structure+Assignment%22%2C%22Salary+Slip%22%2C%22Additional+Salary%22%2C%22Timesheet%22%2C%22Employee+Incentive%22%2C%22Retention+Bonus%22%2C%22Bank+Account%22%2C%22Training+Event%22%2C%22Training+Result%22%2C%22Training+Feedback%22%2C%22Employee+Skill+Map%22%2C%22Appraisal%22%5D&_=1644618932181")
              .headers(headers_11),
            http("request_33")
              .get("/socket.io/?EIO=3&transport=polling&t=NxgxSU7&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_4),
            http("request_34")
              .post("/socket.io/?EIO=3&transport=polling&t=NxgxYay&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_21)
              .body(RawFileBody("tabacuba/addemployee/0034_request.html"))
          )
      )
      .pause(2)
      // logout
      .exec(
        http("request_35")
          .post("/api/method/logout")
          .headers(headers_6)
          .resources(
            http("request_36")
              .post("/socket.io/?EIO=3&transport=polling&t=NxgxcD1&sid=vTOqZ9k3hGB89lmwAACf")
              .headers(headers_21)
              .body(RawFileBody("tabacuba/addemployee/0036_request.json"))
              .check(status().is(400)),
            http("request_37")
              .get("/")
              .headers(headers_3),
            http("request_38")
              .get("/website_script.js?ver=1642771902.0")
              .headers(headers_38),
            http("request_39")
              .post("/")
              .headers(headers_39)
              .formParam("cmd", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled")
          )
      );

    setUp(addemployee.injectOpen(rampUsers(4).during(3)).protocols(httpProtocol));
  }
}
