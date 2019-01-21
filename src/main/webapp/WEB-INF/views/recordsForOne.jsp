<%--
  Created by IntelliJ IDEA.
  User: 32880
  Date: 2019/1/18
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>

    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>当前病历</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/layui/css/layui.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/css/admin.css" />
</head>
<body>
<div class="wrap-container clearfix">
    <div class="column-content-detail">
        <div class="layui-form" id="table-list">
            <table class="layui-table" lay-even lay-skin="nob">
                <colgroup>
                    <col class="hidden-xs" width="100">
                    <col class="hidden-xs" width="150">
                    <col class="hidden-xs" width="150">
                    <col class="hidden-xs" width="150">
                    <col class="hidden-xs" width="200">
                    <col class="hidden-xs" width="150">
                    <col class="hidden-xs" width="150">
                    <col class="hidden-xs" width="150">
                </colgroup>
                <thead>
                <tr>
                    <th class="hidden-xs">病历号</th>
                    <th class="hidden-xs">病人身份证</th>
                    <th class="hidden-xs">病人姓名</th>
                    <th class="hidden-xs">性 别</th>
                    <th class="hidden-xs">登记时间</th>
                    <th class="hidden-xs">科 室</th>
                    <th class="hidden-xs">归档时间</th>
                    <th class="hidden-xs">详 情</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${recoveryDTOList}" var="record">
                    <tr>
                        <td class="hidden-xs">${record.id}</td>
                        <td class="hidden-xs">${record.identityId}</td>
                        <td class="hidden-xs">${record.patientName}</td>
                        <td class=hidden-xs">${record.gender==true ? "男":"女"}</td>
                        <td class="hidden-xs"><fmt:formatDate value="${record.visitingTime}" type="date" pattern="yyyy-MM-dd HH:mm"/></td>
                        <td class="hidden-xs">${record.department}</td>
                        <td class="hidden-xs"><fmt:formatDate value="${record.filingTime}" type="date" pattern="yyyy-MM-dd HH:mm"/></td>


                        <td class="hidden-xs">
                            <div class="layui-inline">
                                <a href="${pageContext.request.contextPath}/recordDetailById?id=${record.id}">  <i class="layui-icon">&#xe642;</i> </a>
                            </div>
                        </td>


                    </tr>
                </c:forEach>
                </tbody>
            </table>



            <div class="page-wrap">
                <div style="position: relative;top: 25px">
                    当前第${pageInfo.pageNum}页，共${pageInfo.pages}页，总共${pageInfo.size}条记录
                </div>
                <div style="position: relative;top: 25px">
                    <ul class="pagination">
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <li>
                                <a href="${pageContext.request.contextPath}/listNow?pn=${pageInfo.prePage}"> <span>«</span>  </a>
                            </li>
                        </c:if>
                        <c:if test="${pageInfo.hasPreviousPage==false}">
                            <li class="disabled"><span>«</span></li>
                        </c:if>


                        <c:forEach items="${pageInfo.navigatepageNums}" var="pageNums">
                            <c:if test="${pageNums == pageInfo.pageNum}">
                                <li class="active">
                                    <a href="${pageContext.request.contextPath}/listNow?pn=${pageNums}">${pageNums}</a>
                                </li>
                            </c:if>
                            <c:if test="${pageNums != pageInfo.pageNum}">
                                <li >
                                    <a href="${pageContext.request.contextPath}/listNow?pn=${pageNums}">${pageNums}</a>
                                </li>
                            </c:if>
                        </c:forEach>



                        <c:if test="${pageInfo.hasNextPage}">
                            <li>
                                <a href="${pageContext.request.contextPath}/listNow?pn=${pageInfo.nextPage}">    <span>»</span>  </a>
                            </li>
                        </c:if>
                        <c:if test="${!pageInfo.hasNextPage}">
                            <li class="disabled"><span>»</span></li>
                        </c:if>


                    </ul>

                </div>


            </div>


        </div>
    </div>
</div>
<script src="${pageContext.request.contextPath}/static/admin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/static/admin/js/common.js" type="text/javascript" charset="utf-8"></script>
<script src="${pageContext.request.contextPath}/static/admin/js/jquery-1.8.3.min.js"></script>
</body>
</html>

