# Fast App Development Tips

## STEP 1

Open [Spring Initializr](https://start.spring.io/).<br>
Set the details, add dependencies as required.<br>
Download it, unzip it.

## STEP 2

Import the project.

## STEP 3

Create separate packages for models, controllers, repositories, and services.

## STEP 4

Create **@Entity** in Models.<br>
Set the type of the **@Id** to **Long**.<br>
Keep adding fields as required later on.

## STEP 5

Create the repositories as **interfaces** extending another interface called **JpaRepository** and set the Entity and Id-type.

## STEP 6

Create **@RestController** API.
Add the methods as required.

## STEP 7

Create **@Service** as required.<br>
Create **Impl(s)** first, as you can extract an interface out of the service later on using Refactoring.<br>
Or you can do vice-versa.

## STEP 8

Add/Edit the **application.properties file**.

## STEP 9

Add the DB yourself!

## STEP 10

Run as Spring Boot App.

## STEP 11

Test the REST API(s) with Postman.



