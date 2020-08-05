<html>

<form action="save" method="post">
    <input type="text" name="id" hidden="true" value="${(personviewbean.person.id)!}"/>
    name:<input type="text" name="name" value="${(personviewbean.person.name)!}"/>
    age:<input type="text" name="age" value="${(personviewbean.person.age)!}"/>
    <input type="submit" value="Сохранить">

</form>


<form action="search" method="post">
  searchquery<input type="text" name = "searchquery" value="${(personviewbean.nameQuery)!}"/>
  <input type="submit" value="Найти">

</form>

<form action="delete" method="post">
  deletequery<input type="text" name = "deletequery" value="${(personviewbean.delQuery)!}"/>
  <input type="submit" value="Удалить">

</form>

<form action="getall" method="post">
  <input type="submit" value="Вывести всех">

</form>
<#-- <h1>${person.id}</h1> -->
<h1></h1>
<h1></h1>
<h1></h1>
<table>
<#list (personviewbean.personList)! as person>
      <tr>
        <td>${(person.id)!}</td>
        <td>${(person.name)!}</td>
        <td>${(person.age)!}</td>
      </tr>
    </#list>
  </table>

</html>
