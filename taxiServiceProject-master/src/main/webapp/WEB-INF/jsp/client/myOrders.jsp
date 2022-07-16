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


            <c:choose>
                <c:when test="${fn:length(orderBeanList) == 0}">No such orders</c:when>

                <c:otherwise>
                    <table id="list_order_table">
                        <thead>
                        <tr>
                            <td>Departure_address</td>
                            <td>Destination_address</td>
                            <td>Passengers number</td>
                            <td>Category</td>
                            <td>Car description</td>
                            <td>Car number</td>
                            <td>Driver</td>
                            <td>Cost</td>
                            <td>Discount cost</td>
                        </tr>
                        </thead>

                        <c:forEach var="bean" items="${orderBeanList}">

                            <tr>
                                <td>${bean.departure_address}</td>
                                <td>${bean.destination_address}</td>
                                <td>${bean.passengers_number}</td>
                                <td>${bean.category_name}</td>
                                <td>${bean.brand} ${bean.model}</td>
                                <td>${bean.car_number}</td>
                                <td>${bean.driver_name} ${bean.driver_surname}</td>
                                <td>${bean.cost}</td>
                                <td>${bean.discount_cost}</td>
                            </tr>

                        </c:forEach>
                    </table>
                </c:otherwise>
            </c:choose>
        </td>
    </tr>

    <%@ include file="/WEB-INF/jspf/footer.jspf"%>

</table>
</body>
</html>