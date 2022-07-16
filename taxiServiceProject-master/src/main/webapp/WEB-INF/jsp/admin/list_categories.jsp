<%@ page pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="List orders" scope="page" />
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body>
<table id="main-container">

    <%@ include file="/WEB-INF/jspf/header.jspf" %>

    <tr>
        <td class="content">
            <h1>All orders</h1>

            <c:choose>
                <c:when test="${fn:length(categoryBeanList) == 0}">No such orders</c:when>

                <c:otherwise>
                    <table id="list_order_table">
                        <thead>
                        <tr>
                            <td>Category_name</td>
                            <td>Count</td>
                        </tr>
                        </thead>

                        <c:forEach var="bean" items="${categoryBeanList}">

                            <tr>
                                <td>${bean.category_name}</td>
                                <td>${bean.count}</td>
                            </tr>

                        </c:forEach>
                    </table>
                </c:otherwise>
            </c:choose>

        </td>
    </tr>

    <%@ include file="/WEB-INF/jspf/footer.jspf" %>

</table>
</body>
</html>
