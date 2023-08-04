package com.joyit.offer.infra.in.graphql;

import com.joyit.offer.application.service.OfferService;
import com.joyit.offer.domain.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class OfferGraphQlController {

    @Autowired
    private OfferService offerService;
    @QueryMapping(name = "offers")
    public List<Offer> getOffers(){
        return offerService.findAllOffers();
    }
    @QueryMapping(name = "areas")
    public List<Area> getAreas(){ return offerService.findAllAreas(); }

    @QueryMapping(name = "countrys")
    public List<Country> getCountrys(){ return offerService.findAllCountrys(); }

    @QueryMapping(name = "estRegs")
    public List<EstReg> getEstRegs(){ return offerService.findAllEstRegs(); }

    @QueryMapping(name = "levelOfExps")
    public List<LevelOfExperience> getLevelOfExp(){ return offerService.findAllLvlOfExps(); }

    @QueryMapping(name = "locations")
    public List<Location> getLocations(){ return offerService.findAllLocations(); }

    @QueryMapping(name = "modalitys")
    public List<Modality> getModalitys(){ return offerService.findAllModalitys(); }

    @QueryMapping(name = "studyGrades")
    public List<StudyGrade> getStudyGrades(){ return offerService.findAllStudyGrades(); }

    @QueryMapping(name = "subAreas")
    public List<SubArea> getSubAreas(){ return offerService.findAllSubAreas(); }

    @QueryMapping(name = "typeOfContracts")
    public List<TypeOfContract> getTypesOfContracts(){ return offerService.findAllTypeOfContracts(); }

    @QueryMapping(name = "workingHours")
    public List<WorkingHours> getWorkingHours(){ return offerService.findAllWorkingHours(); }

    @MutationMapping(name = "createOffer")
    public Offer createOfferGraphQL(@RequestBody Offer offer){
        return offerService.createOffer(offer);
    }
}
