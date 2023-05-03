# UniversityEventManagement
java project using annotation validation h2 database 
java project using annotation validation Enum crudRpository 

## Framework and language used
* Springboot
* java

## dependency used
 * dev
 * web
 * lombok
 * h2-database
 * jpa
 * spring boot starter data jpa 

## Data Flow

### Model
* Users
   *  Integer StudentId
   *  String First Name
   *  string last name
   *  integer age
   *  enum department
*Enum JobType  
   * me
   * ece
   * civil
   * cse
### UserController
* @GetMapping  
    * getAllStudents
    * users/{name}
    
* @PostMapping
    * users
* @DeleteMapping
   * /deleteStudent/{id}


*  @Putmapping 
    * updateDepartment/{department}/id/{id}

### UsersService
 *  getAllUsers
 *  addUsers
 *  removeUserById
 *  updateDepartmentById

### UserRepository
* findAll
* saveAll
* findByEmployName
* deleteById
* findUsersOrderedBySalaryASC

### Database used
* h2 datbase as dependency

##  About Project
* this Project is the about information about unoversity management System
* 
