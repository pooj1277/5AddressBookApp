package com.bridgelabz.AddressbookApp.controller;
import com.bridgelabz.AddressbookApp.dto.AddressBookDTO;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class AddressBookController {

@RequestMapping(value = {"" ,"/","/get"})
    public ResponseEntity<String> getAddressBookData(@PathVariable("id") int id){
    return new ResponseEntity<String>("Get Call Success for id :"+id, HttpStatus.OK);
}

    /**
     * Get-localhost:8081/book/get/1
     */
    @GetMapping("/get/{Id}")
    public ResponseEntity<String> getAddressBookDataById(@PathVariable("Id") int id){
    return new ResponseEntity<String>("Get call Success for id :"+id,HttpStatus.OK);
}

    /**
     * POST-:localhost:8081/book/create
     *
     {
     "id":1,
     "fullName":"pooja",
     "address":"pune",
     "city":"pune",
     "state":"maharashtra",
     "emailId":"bsjsldknmk",
     "zip":"411041",
     "phoneNumber":"9870900978"
     }
     */
    
    @PostMapping("/create")
    public ResponseEntity<String> addAddresBookData(
        @RequestBody AddressBookDTO addressBookDTO){
    return  new ResponseEntity<String>("Create AddressBook Data for :"+addressBookDTO,HttpStatus.OK);
}

    /**
     * Put-localhost:8081/book/update
   
     */

    @PutMapping("/update")
    public ResponseEntity<String> updateAddresBookData(
            @RequestBody AddressBookDTO addressBookDTO){
        return  new ResponseEntity<String>("Update AddressBook Data for :"+addressBookDTO,HttpStatus.OK);
    }

    /**
     * Delete-localhost:8081/book/delete/1
     * @param id
     * @return Delete Call Success for id :1
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("id") int id){
    return  new ResponseEntity<String>("Delete Call Success for id :"+id,HttpStatus.OK);
    }
}