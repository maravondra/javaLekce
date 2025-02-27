package com.engeto.f_souhrny;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Room defaultRoom = new Room(0, "výchozí stav nového majetku");
        Asset asset1 = new Asset("klavír", defaultRoom);
        Asset asset2 = new Asset("lednička", defaultRoom);
        Room developersOffice = new Room(115, "A");
        Asset asset3 = new Asset("kávovar", developersOffice);
        System.out.println(asset1.getDescription());
        // System.out.println(asset1.nextId);
        System.out.println(asset2.getDescription());
        // System.out.println(asset2.nextId);
        System.out.println(asset3.getDescription());
        // System.out.println(asset3.nextId);

        Location locationOfAsset3 = asset3.getLocation();
        System.out.println(
                "Umístění majetku: " + asset3.getDescription() + ": "
                        + locationOfAsset3.getDescription());
        if (locationOfAsset3.getClass().equals(Room.class)) {
            Room locationAsRoom = (Room) locationOfAsset3;
            int roomNumber = locationAsRoom.getRoomNumber();
        }
        System.out.println("Je místnost a location stejný objekt? => "
                + developersOffice.equals(locationOfAsset3));

        // asset1.nextId = 20;
        // System.out.println(asset2.nextId);
        // System.out.println(asset3.nextId);

        System.out.println("1: " + asset1.getId());
        System.out.println("2: " + asset2.getId());
        System.out.println("3: " + asset3.getId());
        int newValue = 10;
        System.out.println("Nastavuji ID 1 na: " + newValue);
        // asset1.setId(newValue);
        System.out.println("1: " + asset1.getId());
        System.out.println("2: " + asset2.getId());
        System.out.println("3: " + asset3.getId());

        AssetRegister register = new AssetRegister();
        register.add(asset1);
        register.addAll(List.of(asset2, asset3));

        System.out.println(register.size());
        register.remove(asset2);
        System.out.println(register.size());
        //register.remove(0);

        register.forEach(System.out::println);

        Employee boss = new Employee("Jan Karas", "ředitel");
        Vehicle vehicle = new Vehicle("Šéfovo fáro", boss);
        vehicle.setMileage(1500);
        System.out.println(vehicle.getDescription());

        register.add(new Vehicle("vozidlo 1", defaultRoom));
        register.add(new Computer("vývojářský notebook", developersOffice, ComputerType.LAPTOP));

        // Vehicle vozidlo1 = (Vehicle) register.get(2); // přetypování
        // Pozor, ale pokud se změní indexy, tak může dojít k výjimce.
        Asset vehicle1 = register.get(2); // přetypování
        System.out.println(vehicle1.getDescription() + ": " + vehicle1.getId());
        // Potřeboval bych přetypování:
        //  System.out.println(vehicle1.getMileage());

        vehicle1.setLocation(new Employee("Jana Drobná"));

        System.out.println(vehicle.getLocation().getDescription());

        System.out.println("---------");
        register.forEach(asset -> {
            System.out.println(asset.getId() + " (" + asset.getDescription() + ") -> "
                    + asset.getLocation().getDescription());
        });
        System.out.println("---------");
        for (Asset asset : register) {
            System.out.println(asset.getId() + " (" + asset.getDescription() + ") -> "
                    + asset.getLocation().getDescription());

        }
    }
}
