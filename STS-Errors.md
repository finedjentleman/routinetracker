# A list of the issues I faced in making this simple project

## 1

Description	  Resource	  Path	            Location	  Type<br>
Unknown	      pom.xml	    /routinetracker	  line 1	    Maven Configuration Problem

Add the line
```
<maven-jar-plugin.version>3.1.1</maven-jar-plugin.version>
```
to pom.xml, so that it looks like:
```
<properties>
		<java.version>1.8</java.version>
		<maven-jar-plugin.version>3.1.1</maven-jar-plugin.version>
</properties>
```

## 2

If infinite references mappings are created between parent and child, such as parent -> child -> parent..., use **@JsonIgnore** on the child alongwith **@ManyToOne**.<br>
This will ignore the infinite recursion problem.<br>
**@JsonBackReference** and **@JsonManagedReference** can also be used. This solves the problem.

## 3

When using an entity called **Item**, be careful to import the correct class when using quick-import.<br>
Hibernate provides a class called org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item, which maybe imported by mistake.

## 4

If your child-table has a foreign key column having only null, and parent doesn't map to the children, make sure that the entities are actually committed to the repository.<br>
JPA/Hibernate won't do it for you automatically! You have to save BOTH sides of the mapping.

## 5

If your database can't be found, well, create one!<br>
Spring automatically creates tables for you, not databases.
