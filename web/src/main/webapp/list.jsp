<%--
  Created by IntelliJ IDEA.
  User: 86185
  Date: 2020/8/3
  Time: 9:19
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <link href="css/css.css" rel="stylesheet">
</head>
<body>
    <form action="list" method="post">
        <input type="hidden" name="cpage">
        会议编号:<input type="text" name="code" value="${map.code}">
        创建时间:<input type="text" name="mohu1" value="${map.mohu1}">
        至<input type="text" name="mohu2" value="${map.mohu2}">
        <input type="submit" value="查寻">
    </form>
    <table>
        <tr>
            <td>序号</td>
            <td>会议编号</td>
            <td>会议名称</td>
            <td>会议开始时间</td>
            <td>会议结束时间</td>
            <td>会议服务</td>
            <td>创建时间</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="l">
            <tr>
                <td>${l.mid}</td>
                <td>${l.code}</td>
                <td>${l.mname}</td>
                <td>${l.start_time}</td>
                <td>${l.end_time}</td>
                <td>${l.snames}</td>
                <td>${l.create_time}</td>
                <td>
                    <input type="button" value="修该" onclick="xiu(${l.mid})">
                    <input type="button" value="删除" onclick="del(${l.mid})">
                </td>
            </tr>
        </c:forEach>
        <tr>
            <td colspan="11">
                <input type="button" value="新增" onclick="add()">
                <input type="button" value="上一页" onclick="fenye(${p.isIsFirstPage()?1:p.getPrePage()})">
                <c:forEach items="${p.navigatepageNums}" var="n">
                    <input type="button" onclick="fenye(${n})" value="${n}">
                </c:forEach>
                <input type="button" value="下一页" onclick="fenye(${p.isIsLastPage()?p.getPages():p.getNextPage()})">
            </td>
        </tr>
    </table>

</body>
    <script type="text/javascript">
        function fenye(cpage) {
            $("[name = 'cpage']").val(cpage);
            $("form").submit();
        }
        function add() {
            location = "toAdd";
        }
        function del(mid) {
            location = "delete?mid="+mid;
        }
        function xiu(mid) {
            location = "toXiu?mid="+mid;
        }
    </script>
</html>
