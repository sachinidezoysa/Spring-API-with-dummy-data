/*
package com.revport.controller;

import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.web.client.RestTemplate;

import com.revport.model.Employee;

public class SpringRestTestClient {

//    public static final String REST_SERVICE_URI = "<a class="vglnk" href="http://localhost:8080/Spring4MVCCRUDRestService" rel="nofollow"><span>http</span><span>://</span><span>localhost</span><span>:</span><span>8080</span><span>/</span><span>Spring4MVCCRUDRestService</span></a>";

    */
/* GET *//*

    @SuppressWarnings("unchecked")
    private static void listAllUsers(){
        System.out.println("Testing listAllUsers API-----------");

        RestTemplate restTemplate = new RestTemplate();
        List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI+"/user/", List.class);

        if(usersMap!=null){
            for(LinkedHashMap<String, Object> map : usersMap){
                System.out.println("Employee : id="+map.get("id")+", Name="+map.get("name")+", Age="+map.get("age")+", Salary="+map.get("salary"));;
            }
        }else{
            System.out.println("No user exist----------");
        }
    }

    */
/* GET *//*

    private static void getUser(){
        System.out.println("Testing getUser API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee user = restTemplate.getForObject(REST_SERVICE_URI+"/user/1", Employee.class);
        System.out.println(user);
    }

    */
/* POST *//*

    private static void createUser() {
        System.out.println("Testing create Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee user = new Employee(0,"Sarah",51,134);
        URI uri = restTemplate.postForLocation(REST_SERVICE_URI+"/user/", user, Employee.class);
        System.out.println("Location : "+uri.toASCIIString());
    }

    */
/* PUT *//*

    private static void updateUser() {
        System.out.println("Testing update Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        Employee user  = new Employee(1,"Tomy",33, 70000);
        restTemplate.put(REST_SERVICE_URI+"/user/1", user);
        System.out.println(user);
    }

    */
/* DELETE *//*

    private static void deleteUser() {
        System.out.println("Testing delete Employee API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/3");
    }


    */
/* DELETE *//*

    private static void deleteAllUsers() {
        System.out.println("Testing all delete Users API----------");
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(REST_SERVICE_URI+"/user/");
    }

    public static void main(String args[]){
        listAllUsers();
        getUser();
        createUser();
        listAllUsers();
        updateUser();
        listAllUsers();
        deleteUser();
        listAllUsers();
        deleteAllUsers();
        listAllUsers();
    }
}
*/
