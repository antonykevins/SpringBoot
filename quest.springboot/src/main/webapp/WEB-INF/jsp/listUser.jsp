<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp"></jsp:include>
<h1>List User</h1>
<!-- Page to list all registered Users -->
<table class="table table-hover">
    <thead>
      <tr>
        <th><b>Name</b></th>
        <th><b>PPS Number</b></th>
        <th><b>Date Of Birth</b></th>
        <th><b>Mobile Phone Number</b></th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="lou">
      <tr>
        <td><c:out value="${lou.name}"></c:out></td>
        <td><c:out value="${lou.pps}"></c:out></td>
        <td><c:out value="${lou.dob}"></c:out></td>
        <td><c:out value="${lou.phone}"></c:out></td>
      </tr>
    </c:forEach>
    </tbody>
  </table>
</div>