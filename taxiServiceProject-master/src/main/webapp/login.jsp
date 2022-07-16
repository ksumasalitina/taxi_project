<%@ include file="/WEB-INF/jspf/directive/page.jspf" %>
<%@ include file="/WEB-INF/jspf/directive/taglib.jspf" %>

<html>

<c:set var="title" value="Login"/>
<%@ include file="/WEB-INF/jspf/head.jspf" %>

<body class="login-body">

<form id="login-form" action="controller" method="post">

    <input type="hidden" name="command" value="email"/>
    <div class="login-field">
    <legend>
        Email
    </legend>
    <input class="login-input" name="email" placeholder="username"/><br/>
    </div>
    <div class="login-field">
    <legend>
        Password
    </legend>
    <input class="login-input" type="password" name="password" placeholder="password"/>
    </div>

    <div class="login-button">
    <input class="submit" type="submit" value='Log in'>
    </div>
</form>

</body>
</html>