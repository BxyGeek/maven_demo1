<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<body>
<h2>Hello World!</h2>

<c:forEach items="${sessionScope.users}" var="user">
    ${user.id}=======${user.name}=====${user.age}
</c:forEach>
</body>
</html>
