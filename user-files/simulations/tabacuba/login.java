package tabacuba;

import java.time.Duration;
import java.util.*;

import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import io.gatling.javaapi.jdbc.*;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;
import static io.gatling.javaapi.jdbc.JdbcDsl.*;

public class login extends Simulation {
  {
    HttpProtocolBuilder httpProtocol = http
      .baseUrl("https://erptest.avangenio.net")
      .inferHtmlResources(AllowList(), DenyList())
      .acceptHeader("*/*")
      .acceptLanguageHeader("es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3")
      .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:96.0) Gecko/20100101 Firefox/96.0");
    
    Map<CharSequence, String> headers_0 = new HashMap<>();
    headers_0.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_0.put("Accept-Encoding", "gzip, deflate, br");
    headers_0.put("Sec-Fetch-Dest", "document");
    headers_0.put("Sec-Fetch-Mode", "navigate");
    headers_0.put("Sec-Fetch-Site", "none");
    headers_0.put("Sec-Fetch-User", "?1");
    headers_0.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_1 = new HashMap<>();
    headers_1.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_1.put("Accept-Encoding", "gzip, deflate, br");
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
    headers_2.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
    headers_2.put("Accept-Encoding", "gzip, deflate, br");
    headers_2.put("Sec-Fetch-Dest", "document");
    headers_2.put("Sec-Fetch-Mode", "navigate");
    headers_2.put("Sec-Fetch-Site", "same-origin");
    headers_2.put("Sec-Fetch-User", "?1");
    headers_2.put("Upgrade-Insecure-Requests", "1");
    
    Map<CharSequence, String> headers_3 = new HashMap<>();
    headers_3.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_3.put("Accept-Encoding", "gzip, deflate, br");
    headers_3.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_3.put("Origin", "https://erptest.avangenio.net");
    headers_3.put("Sec-Fetch-Dest", "empty");
    headers_3.put("Sec-Fetch-Mode", "cors");
    headers_3.put("Sec-Fetch-Site", "same-origin");
    headers_3.put("X-Frappe-CMD", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled");
    headers_3.put("X-Frappe-CSRF-Token", "None");
    headers_3.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_4 = new HashMap<>();
    headers_4.put("Accept", "application/json, text/javascript, */*; q=0.01");
    headers_4.put("Accept-Encoding", "gzip, deflate, br");
    headers_4.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_4.put("Origin", "https://erptest.avangenio.net");
    headers_4.put("Sec-Fetch-Dest", "empty");
    headers_4.put("Sec-Fetch-Mode", "cors");
    headers_4.put("Sec-Fetch-Site", "same-origin");
    headers_4.put("X-Frappe-CMD", "login");
    headers_4.put("X-Frappe-CSRF-Token", "None");
    headers_4.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_6 = new HashMap<>();
    headers_6.put("Accept-Encoding", "gzip, deflate, br");
    headers_6.put("Sec-Fetch-Dest", "script");
    headers_6.put("Sec-Fetch-Mode", "no-cors");
    headers_6.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_11 = new HashMap<>();
    headers_11.put("Accept", "text/css,*/*;q=0.1");
    headers_11.put("Accept-Encoding", "gzip, deflate, br");
    headers_11.put("Sec-Fetch-Dest", "style");
    headers_11.put("Sec-Fetch-Mode", "no-cors");
    headers_11.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_14 = new HashMap<>();
    headers_14.put("Accept", "application/font-woff2;q=1.0,application/font-woff;q=0.9,*/*;q=0.8");
    headers_14.put("Accept-Encoding", "identity");
    headers_14.put("Sec-Fetch-Dest", "font");
    headers_14.put("Sec-Fetch-Mode", "cors");
    headers_14.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_17 = new HashMap<>();
    headers_17.put("Accept-Encoding", "gzip, deflate, br");
    headers_17.put("Sec-Fetch-Dest", "empty");
    headers_17.put("Sec-Fetch-Mode", "cors");
    headers_17.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_18 = new HashMap<>();
    headers_18.put("Accept", "application/json");
    headers_18.put("Accept-Encoding", "gzip, deflate, br");
    headers_18.put("Origin", "https://erptest.avangenio.net");
    headers_18.put("Sec-Fetch-Dest", "empty");
    headers_18.put("Sec-Fetch-Mode", "cors");
    headers_18.put("Sec-Fetch-Site", "same-origin");
    headers_18.put("X-Frappe-CMD", "");
    headers_18.put("X-Frappe-CSRF-Token", "500bb520710bc4d2b7e5f3eef44af306fcd0aca3e870abb020a3b621");
    headers_18.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_19 = new HashMap<>();
    headers_19.put("Accept", "application/json");
    headers_19.put("Accept-Encoding", "gzip, deflate, br");
    headers_19.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
    headers_19.put("Origin", "https://erptest.avangenio.net");
    headers_19.put("Sec-Fetch-Dest", "empty");
    headers_19.put("Sec-Fetch-Mode", "cors");
    headers_19.put("Sec-Fetch-Site", "same-origin");
    headers_19.put("X-Frappe-CMD", "");
    headers_19.put("X-Frappe-CSRF-Token", "500bb520710bc4d2b7e5f3eef44af306fcd0aca3e870abb020a3b621");
    headers_19.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_21 = new HashMap<>();
    headers_21.put("Accept", "application/json");
    headers_21.put("Accept-Encoding", "gzip, deflate, br");
    headers_21.put("Sec-Fetch-Dest", "empty");
    headers_21.put("Sec-Fetch-Mode", "cors");
    headers_21.put("Sec-Fetch-Site", "same-origin");
    headers_21.put("X-Frappe-CMD", "");
    headers_21.put("X-Frappe-CSRF-Token", "500bb520710bc4d2b7e5f3eef44af306fcd0aca3e870abb020a3b621");
    headers_21.put("X-Frappe-Doctype", "Notification%20Log");
    headers_21.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_22 = new HashMap<>();
    headers_22.put("Accept", "audio/webm,audio/ogg,audio/wav,audio/*;q=0.9,application/ogg;q=0.7,video/*;q=0.6,*/*;q=0.5");
    headers_22.put("Range", "bytes=0-");
    headers_22.put("Sec-Fetch-Dest", "audio");
    headers_22.put("Sec-Fetch-Mode", "no-cors");
    headers_22.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_31 = new HashMap<>();
    headers_31.put("Accept", "image/avif,image/webp,*/*");
    headers_31.put("Accept-Encoding", "gzip, deflate, br");
    headers_31.put("Sec-Fetch-Dest", "image");
    headers_31.put("Sec-Fetch-Mode", "no-cors");
    headers_31.put("Sec-Fetch-Site", "same-origin");
    
    Map<CharSequence, String> headers_32 = new HashMap<>();
    headers_32.put("Accept", "application/json");
    headers_32.put("Accept-Encoding", "gzip, deflate, br");
    headers_32.put("Sec-Fetch-Dest", "empty");
    headers_32.put("Sec-Fetch-Mode", "cors");
    headers_32.put("Sec-Fetch-Site", "same-origin");
    headers_32.put("X-Frappe-CMD", "");
    headers_32.put("X-Frappe-CSRF-Token", "500bb520710bc4d2b7e5f3eef44af306fcd0aca3e870abb020a3b621");
    headers_32.put("X-Frappe-Doctype", "Dashboard%20Settings");
    headers_32.put("X-Requested-With", "XMLHttpRequest");
    
    Map<CharSequence, String> headers_39 = new HashMap<>();
    headers_39.put("Accept-Encoding", "gzip, deflate, br");
    headers_39.put("Content-type", "text/plain;charset=UTF-8");
    headers_39.put("Origin", "https://erptest.avangenio.net");
    headers_39.put("Sec-Fetch-Dest", "empty");
    headers_39.put("Sec-Fetch-Mode", "cors");
    headers_39.put("Sec-Fetch-Site", "same-origin");

    FeederBuilder.Batchable<String> users =
            csv("users.csv").queue();

    ScenarioBuilder login = scenario("login")
            // login
            .feed(users)
            .exec(
                    http("request_0")
                            .get("/")
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
                            .get("/login")
                            .headers(headers_2)
                            .resources(
                                    http("request_3")
                                            .post("/")
                                            .headers(headers_3)
                                            .formParam("cmd", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled")
                            )
            )
            .pause(2)
            .exec(
                    http("request_4")
                            .post("/")
                            .headers(headers_4)
                            .formParam("cmd", "login")
                            .formParam("usr", "#{username}")
                            .formParam("pwd", "#{password}")
                            .formParam("device", "desktop")
                            .resources(
                                    http("request_5")
                                            .get("/app")
                                            .headers(headers_2),
                                    http("request_6")
                                            .get("/assets/js/list.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_7")
                                            .get("/assets/js/report.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_8")
                                            .get("/assets/js/control.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_9")
                                            .get("/assets/js/erpnext.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_10")
                                            .get("/assets/js/libs.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_11")
                                            .get("/assets/css/report.min.css?ver=1642771902.0")
                                            .headers(headers_11),
                                    http("request_12")
                                            .get("/assets/css/erpnext.css?ver=1642771902.0")
                                            .headers(headers_11),
                                    http("request_13")
                                            .get("/assets/css/desk.min.css?ver=1642771902.0")
                                            .headers(headers_11),
                                    http("request_14")
                                            .get("/assets/frappe/css/fonts/inter/inter_regular.woff2")
                                            .headers(headers_14),
                                    http("request_15")
                                            .get("/assets/js/form.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_16")
                                            .get("/assets/js/desk.min.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_17")
                                            .get("/socket.io/?EIO=3&transport=polling&t=NxfBtf7")
                                            .headers(headers_17),
                                    http("request_18")
                                            .post("/api/method/frappe.core.doctype.user_permission.user_permission.get_user_permissions")
                                            .headers(headers_18),
                                    http("request_19")
                                            .post("/api/method/frappe.desk.doctype.event.event.get_events")
                                            .headers(headers_19)
                                            .formParam("start", "2022-02-11")
                                            .formParam("end", "2022-02-11"),
                                    http("request_20")
                                            .post("/api/method/frappe.desk.doctype.tag.tag.get_tags_list_for_awesomebar")
                                            .headers(headers_18),
                                    http("request_21")
                                            .get("/api/method/frappe.desk.reportview.get_list?fields=%5B%22*%22%5D&limit=20&order_by=creation+desc&doctype=Notification+Log&_=1644589708505")
                                            .headers(headers_21),
                                    http("request_22")
                                            .get("/assets/frappe/sounds/email.mp3")
                                            .headers(headers_22),
                                    http("request_23")
                                            .get("/assets/frappe/sounds/submit.mp3")
                                            .headers(headers_22),
                                    http("request_24")
                                            .get("/assets/frappe/sounds/cancel.mp3")
                                            .headers(headers_22),
                                    http("request_25")
                                            .get("/assets/frappe/sounds/delete.mp3")
                                            .headers(headers_22),
                                    http("request_26")
                                            .post("/api/method/frappe.desk.desktop.get_desktop_page")
                                            .headers(headers_19)
                                            .formParam("page", "Home"),
                                    http("request_27")
                                            .get("/assets/frappe/sounds/click.mp3")
                                            .headers(headers_22),
                                    http("request_28")
                                            .get("/assets/frappe/css/fonts/inter/inter_bold.woff2")
                                            .headers(headers_14),
                                    http("request_29")
                                            .get("/assets/frappe/sounds/alert.mp3")
                                            .headers(headers_22),
                                    http("request_30")
                                            .get("/assets/frappe/sounds/error.mp3")
                                            .headers(headers_22),
                                    http("request_31")
                                            .get("/assets/frappe/images/ui-states/event-empty-state.svg")
                                            .headers(headers_31),
                                    http("request_32")
                                            .get("/api/method/frappe.desk.reportview.get_list?filters=%7B%22name%22%3A%22#{user}%40#{domain}%22%7D&fields=%5B%22*%22%5D&doctype=Dashboard+Settings&limit=20&_=1644589708506")
                                            .headers(headers_32),
                                    http("request_33")
                                            .get("/assets/erpnext/sounds/incoming-call.mp3")
                                            .headers(headers_22),
                                    http("request_34")
                                            .get("/assets/erpnext/sounds/call-disconnect.mp3")
                                            .headers(headers_22),
                                    http("request_35")
                                            .get("/assets/frappe/images/ui-states/notification-empty-state.svg")
                                            .headers(headers_31),
                                    http("request_36")
                                            .get("/assets/frappe/css/fonts/inter/inter_semibold.woff2")
                                            .headers(headers_14),
                                    http("request_37")
                                            .get("/assets/frappe/css/fonts/inter/inter_medium.woff2")
                                            .headers(headers_14)
                            )
            )
            .pause(2)
            // logout
            .exec(
                    http("request_38")
                            .post("/api/method/logout")
                            .headers(headers_18)
                            .resources(
                                    http("request_39")
                                            .post("/socket.io/?EIO=3&transport=polling&t=NxfBy7H&sid=k6HrOjD_DQDMSiktAABz")
                                            .headers(headers_39)
                                            .body(RawFileBody("tabacuba/login/0039_request.json"))
                                            .check(status().is(400)),
                                    http("request_40")
                                            .get("/")
                                            .headers(headers_2),
                                    http("request_41")
                                            .get("/website_script.js?ver=1642771902.0")
                                            .headers(headers_6),
                                    http("request_42")
                                            .post("/")
                                            .headers(headers_3)
                                            .formParam("cmd", "erpnext.e_commerce.doctype.e_commerce_settings.e_commerce_settings.is_cart_enabled")
                            )
            );

    setUp(login.injectOpen(rampUsers(11).during(5)).protocols(httpProtocol));
  }
}
