## CRM REST Service

This application is an introduction to RESTFul services.
It consists of H2 Database with 100 sample records (id, first_name, last_name, email, phone).
By specified endpoints it is possible to:
* List all customers
* Filter customers by:
  * Last name
  * First name
  * Email
  * All of above
* Get customer by ID
* Create customer
* Update customer by ID
* Delete customer by ID

Invalid requests are handled by exception handlers.

## Built with

* Spring Boot
* Maven
* Spring REST
* Sprint Data
* H2 Database

## Sample usage (e.g. with POSTMAN)

#### Get CUSTOMERS:
<p><b>http://localhost:8090/api/customers</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/get-customers.JPG" width="25%" height="25%">
</p>

#### Filter CUSTOMERS
* By last name
<p><b>http://localhost:8090/api/customers/order_by=last_name</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/filter-by-lastname.JPG" width="25%" height="25%">
</p>

* By first name
<p><b>http://localhost:8090/api/customers/order_by=first_name</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/filter-by-firstname.JPG" width="25%" height="25%">
</p>

* By email
<p><b>http://localhost:8090/api/customers/order_by=email</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/filter-by-email.JPG" width="25%" height="25%">
</p>

* Filter by any
<p><b>http://localhost:8090/api/customers/filter={value}</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/filter-by-any.JPG" width="25%" height="25%">
</p>

#### Get CUSTOMER by ID
<p><b>http://localhost:8090/api/customers/{id}</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/get-customer.JPG" width="25%" height="25%">
</p>

#### Save CUSTOMER
<p><b>http://localhost:8090/api/customers/add-new</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/add-new.JPG" width="25%" height="25%">
</p>

#### Update CUSTOMER
<p><b>http://localhost:8090/api/customers/update/{id}</b></p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/update-customer-before.JPG" width="25%" height="25%">
</p>
<p align="center">
  <img src="https://github.com/konopkagrzegorz/crm-rest-service/blob/master/images/update-customer-after.JPG" width="25%" height="25%">
</p>

#### Delete CUSTOMER
<p><b>http://localhost:8090/api/customers/delete/{id}</b></p>

## Authors

* [Grzegorz Konopka](https://github.com/konopkagrzegorz)

## License

This project is an open source application
