package abir_hello

import abir_hello.Vehicle

class BootStrap {

    def init = { servletContext ->
        new Vehicle(name: 'Pickup',  make: 'nissan', model: 'titan').save()
        new Vehicle(name: 'Economy', make: 'nissan', model: 'leaf').save()
        new Vehicle(name: 'Minivan', make: 'ford', model: 'windstar').save()
    }
    def destroy = {
    }
}
