# AlbumListing
A simple AlbumListing providing REST APIs to manage photos and albums. Developed using Java and Spring boot framework.

```
##The Rest API supports the following functionalities: 

1) Albums - Create a new album - POST : /myapi/albums - Read/Return a list of all albums - GET : /myapi/albums - Update an existing album - PUT : /myapi/albums/{id} - Delete an existing album - DELETE : /myapi/albums/{id} (Constraint: No photos in the album)

2) Photos
	- Create a new photo - POST : /myapi/photos
	- Read/Return a list of all photos - GET : /myapi/photos
	- Update an existing photo - PUT : /myapi/photo/{id}
	- Delete an existing photo - DELETE : /myapi/photos/{id}
	- Read/Return a list of photos in a given album - GET : /myapi/photos/byalbum/{id}
	
3) Initialize data
	- Initialze data to the use the above functionality - GET : /myapi/init
	- Data sources : https://jsonplaceholder.typicode.com/albums
					 https://jsonplaceholder.typicode.com/photos
           
```

**How to install/use?**
1. Update the database related configuration in application.properties
2. Have JDK 17
3. Run the application
4. Got to http://localhost:8080/myapi/init to initialize the data and you are good to test the rest of the functionality
