package com.Baseer.CURD.project;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController (SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService =  softwareEngineerService;
    }
    @GetMapping
    public List<SoftwareEngineer> getEngineers(){
        return softwareEngineerService.getSoftwareEngineers();
    }
    @GetMapping({"id"})
    public SoftwareEngineer getEngineerById(@PathVariable Integer id){
        return softwareEngineerService.getSoftwareEngineerById(id);
    }
    @PostMapping
   public void addNewSoftwareEngineer(SoftwareEngineer softwareEngineer){
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
   }
}
