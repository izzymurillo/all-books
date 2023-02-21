<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>New Book</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/darkly.css" />
    <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
    <!-- change to match your file/naming structure -->
  </head>
  <body>
    <div class="container m-5">
      <div class="card m-3">
        <div class="card-header">
          <h1>Add a Book</h1>
        </div>
        <div class="card-body">
          <form:form action="/books" method="post" modelAttribute="book" class="form-control mb-3">
            <form:label class="form-label" path="title"><h4>Title</h4></form:label>
            <form:input path="title" type="text" class="form-control mb-3" />
            <form:label class="form-label" path="author"><h4>Author</h4></form:label>
            <form:input path="author" type="text" class="form-control mb-3" />
            <form:label class="form-label" path="pages"><h4>Pages</h4></form:label>
            <form:input path="pages" type="text" class="form-control mb-3" />
            <div class="d-flex justify-content-end">
              <button class="btn btn-primary m-3" type="submit">
                Add Book
              </button>
            </div>
          </form:form>
          <!-- vvv use " tags instead of regular form tag -->
          <!-- <form:form action="/books" method="post" modelAttribute="book" class="form-control mb-3"> 
            <div class="form-control">
                <form:label path="title"><h4>Title</h4></form:label>
                <form:errors path="title"/>
                <form:input path="title"></form:input>
            </div>
            <div class="form-control">
                <form:label path="author"><h4>Author</h4></form:label>
                <form:errors path="author"/>
                <form:input path="author"></form:input>
            </div>
            <div class="form-control">
                <form:label path="pages"><h4>Pages</h4></form:label>
                <form:input path="pages"></form:input>
            </div>
            <input type="submit" value="add book">
            </form:form> -->
          <a href="/">Back to Home</a>
        </div>
      </div>
    </div>
  </body>
</html>
