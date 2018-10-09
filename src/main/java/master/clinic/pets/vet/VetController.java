/*
 * Copyright 2012-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package master.clinic.pets.vet;

import master.clinic.pets.model.VetSpeciality;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.Map;

import javax.validation.Valid;

/**
 * @author Juergen Hoeller
 * @author Mark Fisher
 * @author Ken Krebs
 * @author Arjen Poutsma
 */
@Controller
class VetController {

    private final VetRepository vets;
    private final SpecialtyRepository specs;
    private static final String VIEWS_VET_CREATE_OR_UPDATE_FORM = "vets/createOrUpdateVetForm";

    public VetController(VetRepository clinicService, SpecialtyRepository specialtyRepository) {
        this.vets = clinicService;
        this.specs = specialtyRepository;
    }

    @GetMapping("/vets.html")
    public String showVetList(Map<String, Object> model) {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for Object-Xml mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        model.put("vets", vets);
        return "vets/vetList";
    }

    @GetMapping({"/vets"})
    public @ResponseBody
    Vets showResourcesVetList() {
        // Here we are returning an object of type 'Vets' rather than a collection of Vet
        // objects so it is simpler for JSon/Object mapping
        Vets vets = new Vets();
        vets.getVetList().addAll(this.vets.findAll());
        return vets;
    }

    @GetMapping("/vets/new")
    public String initCreationForm(Map<String, Object> model) {
        model.put("vet", new Vet());
        model.put("specialty", new Specialty());
        return VIEWS_VET_CREATE_OR_UPDATE_FORM;
    }

    @PostMapping("/vets/new")
    public String processCreationForm(Vet vet, Specialty specialty, Map<String, Object> model, BindingResult result) {
        if (result.hasErrors()) {
            return VIEWS_VET_CREATE_OR_UPDATE_FORM;
        } else {
            vets.save(specialty);
            vet.addSpecialty(specialty);
            vets.save(vet);
            return "redirect:/vets/" + vet.getId();
        }
    }

    @GetMapping("/vets/{vetId}/edit")
    public String initUpdateVetForm(@PathVariable("vetId") int vetId, Map<String, Object> model) {
        Vet vet = this.vets.findById(vetId);
        model.put("vet", vet);
        model.put("specialty", vet.getSpecialties().get(0));
        return VIEWS_VET_CREATE_OR_UPDATE_FORM;
    }

    @PostMapping("/vets/{vetId}/edit")
    public String processUpdateVetForm(@Valid Vet vet, Specialty specialty, BindingResult result, @PathVariable("vetId") int vetId) {
        if (result.hasErrors()) {
            return VIEWS_VET_CREATE_OR_UPDATE_FORM;
        } else {
            vet.setId(vetId);
            if (specialty != null && vet.getSpecialties().isEmpty()) {
                vet.addSpecialty(specialty);
                vets.save(specialty);
            }
            vets.save(specialty);
            this.vets.save(vet);
            return "redirect:/vets/{vetId}";
        }
    }

    /**
     * Custom handler for displaying an owner.
     *
     * @return a ModelMap with the model attributes for the view
     */
    @GetMapping("/vets/{vetId}")
    public ModelAndView showVEt(@PathVariable("vetId") int vetId) {
        ModelAndView mav = new ModelAndView("vets/vetDetails");
        mav.addObject(this.vets.findById(vetId));
        return mav;
    }

}
