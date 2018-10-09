package master.clinic.pets.model;

import master.clinic.pets.vet.Specialty;
import master.clinic.pets.vet.Vet;

public class VetSpeciality {
    Vet vet;
    Specialty spec;

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Specialty getSpec() {
        return spec;
    }

    public void setSpec(Specialty spec) {
        this.spec = spec;
    }
}
