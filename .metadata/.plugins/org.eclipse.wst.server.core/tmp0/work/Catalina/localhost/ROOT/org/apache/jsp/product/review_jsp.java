/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2023-12-29 03:44:37 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class review_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/product/../footer.jsp", Long.valueOf(1703761237729L));
    _jspx_dependants.put("/product/../header.jsp", Long.valueOf(1703761238224L));
    _jspx_dependants.put("jar:file:/C:/Users/abh/work/springworkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ShoppingMallProject/WEB-INF/lib/jstl-1.2.jar!/META-INF/c-1_0-rt.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1700730900031L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/product/review.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;700&display=swap\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\" />\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/header.css\">\r\n");
      out.write("<header>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"/main.do\">DAZZLE</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\"\r\n");
      out.write("				data-bs-toggle=\"collapse\" data-bs-target=\"#navbarNavDropdown\"\r\n");
      out.write("				aria-controls=\"navbarNavDropdown\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarNavDropdown\">\r\n");
      out.write("				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("						aria-current=\"page\" href=\"/main.do\">HOME</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/category_products.do?category=1\">TOP</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/category_products.do?category=2\">BOTTOM</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/category_products.do?category=3\">OUTER</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/category_products.do?category=4\">SHOES</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/category_products.do?category=5\">ETC</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<ul class=\"navbar-nav gap-2\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"/boardMain.do\">CODY</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"/cart.do\">CART</a></li>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"/sign/goRegister.do\">JOIN</a></li>\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("					");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("				<form class=\"d-flex mt-3\" action=\"/search_result.do\">\r\n");
      out.write("					<input class=\"form-control me-1\" type=\"search\" placeholder=\"Search\" name=\"search_keyword\"\r\n");
      out.write("						aria-label=\"Search\" />\r\n");
      out.write("					<button class=\"btn btn-outline-success\" type=\"submit\">\r\n");
      out.write("						<i class=\"fas fa-search\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- <script -->\r\n");
      out.write("<!-- 	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" -->\r\n");
      out.write("<!-- 	integrity=\"sha384-kQtW33rZJAHjy8F/xC0k+O2eFgHgOnMm7e3f0sM/9f0zUYGPtFhQJhXdJiV6pG5a\" -->\r\n");
      out.write("<!-- 	crossorigin=\"anonymous\"></script> -->");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("	<div class=\"container py-5\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-8 offset-md-2\">\r\n");
      out.write("				<div class=\"content-box\">\r\n");
      out.write("					<form action=\"/submit_review.do\"  method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("						<input type=\"hidden\" name=\"product_code\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${product_code}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">평점을 남겨주세요</label>\r\n");
      out.write("							<div id=\"ratingStars\">\r\n");
      out.write("								<select style=\" color: #FFD700;\" name=\"review_ratings\">\r\n");
      out.write("			                   		<option value=\"1\">★</option>\r\n");
      out.write("			                   		<option value=\"2\">★★</option>\r\n");
      out.write("			                   		<option value=\"3\">★★★</option>\r\n");
      out.write("			                   		<option value=\"4\">★★★★</option>\r\n");
      out.write("			                   		<option value=\"5\">★★★★★</option>\r\n");
      out.write("			                   	</select>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label class=\"form-label\">사진 첨부</label>\r\n");
      out.write("							<div class=\"row\">\r\n");
      out.write("								<div class=\"col-4\">\r\n");
      out.write("									<div class=\"image-placeholder\" id=\"imagePreview\">\r\n");
      out.write("										<i class=\"far fa-image\"></i>\r\n");
      out.write("									</div>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-8\">\r\n");
      out.write("									<input type=\"file\" accept=\"image/*\" id=\"imageInput\" name=\"review_img2\"\r\n");
      out.write("										style=\"display: none\" onchange=\"previewImage()\" />\r\n");
      out.write("									<button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("										onclick=\"document.getElementById('imageInput').click();\">\r\n");
      out.write("										이미지 선택</button>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"mb-3\">\r\n");
      out.write("							<label for=\"contentTextarea\" class=\"form-label\">내용</label>\r\n");
      out.write("							<textarea class=\"form-control\" id=\"contentTextarea\" rows=\"5\" name=\"review_content\"\r\n");
      out.write("								placeholder=\"리뷰 내용을 작성해주세요\"></textarea>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"checkbox-group\">\r\n");
      out.write("							<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("								id=\"agreeCheck1\" /> <label\r\n");
      out.write("								class=\"form-check-label\" for=\"agreeCheck1\">전체\r\n");
      out.write("								동의</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"checkbox-group\">\r\n");
      out.write("							<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("								id=\"agreeCheck2\" /> <label\r\n");
      out.write("								class=\"form-check-label\" for=\"agreeCheck2\">정보제공에\r\n");
      out.write("								관한 DAZZLE 정책 동의 (필수)</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"checkbox-group\">\r\n");
      out.write("							<input class=\"form-check-input\" type=\"checkbox\" value=\"\"\r\n");
      out.write("								id=\"agreeCheck3\" /> <label\r\n");
      out.write("								class=\"form-check-label\" for=\"agreeCheck3\">보내는\r\n");
      out.write("								내용이 사실과 다를 경우 불이익을 받을 수 있음을 이해합니다. (필수)</label>\r\n");
      out.write("						</div>\r\n");
      out.write("						<button type=\"submit\" class=\"btn btn-submit mt-3\"\r\n");
      out.write("							onclick=\"checkAgreement()\">리뷰 등록</button>\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("<link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\r\n");
      out.write("    />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/resources/css/footer.css\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"footer\">\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col\">\r\n");
      out.write("				<a href=\"/noticeMain.do\">NOTICE</a> <a href=\"/questionMain.do\">INQUIRY</a> <a href=\"/user/orderList.do\">MY\r\n");
      out.write("					ORDER</a> <a href=\"/faq.do\">HELP</a>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col\">\r\n");
      out.write("				<div class=\"social-icons\">\r\n");
      out.write("					<a href=\"#\"><i class=\"fab fa-facebook-f\"></i></a> <a href=\"#\"><i\r\n");
      out.write("						class=\"fab fa-twitter\"></i></a> <a href=\"#\"><i\r\n");
      out.write("						class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"col text-end\">©2023 DAZZLE / All rights reserved.</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("	<script src=\"../resources/js/product/review.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /product/../header.jsp(48,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.is_admin == 1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
          out.write("						href=\"/admin/userList.do\">ADMIN PAGE</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /product/../header.jsp(52,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.is_admin == 0 }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
          out.write("						href=\"/user/orderList.do\">MY PAGE</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /product/../header.jsp(58,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_name == null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
          out.write("						href=\"/sign/goLogin.do\">LOGIN</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /product/../header.jsp(62,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.user_name != null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("						<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
          out.write("						href=\"/sign/logout.do\">LOGOUT</a></li>\r\n");
          out.write("					");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}
