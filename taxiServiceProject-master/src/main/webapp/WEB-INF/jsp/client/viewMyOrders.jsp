<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="New order" />
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body>

<table id="main-container">

    <%@ include file="/WEB-INF/jspf/header.jspf" %>

    <tr >
        <td class="content center">

            <form id="form" action="controller" method="get">
                <input type="hidden" name="command" value="myOrders" />
                    <p>Hi, <c:out value="${user.name}"/>!</p>
                    <input type="hidden" name="user_id" value="${user.id}">
                <input type="submit" value='View all orders'>

            </form>
        </td>
    </tr>

    <%@ include file="/WEB-INF/jspf/footer.jspf"%>

</table>
</body>
</html>