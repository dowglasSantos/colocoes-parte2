import java.util.*;

public class CreateListUser {
    public void createList() {
        Scanner s = new Scanner(System.in);
        SettingsDatas settingsDatas = new SettingsDatas();
        Map<String, List<SettingsDatas>> listUser = new HashMap<>();

        listUser.put("masculino", new LinkedList<>());
        listUser.put("feminino", new LinkedList<>());

        String options = " ";

        System.out.print("Você deseja adicionar usuarios a lista(sim/não): ");
        options = s.next();

        while(options.equalsIgnoreCase("sim")) {
            System.out.print("Informe o nome do usuario: ");
            settingsDatas.setNameUser(s.next());

            System.out.println(" ");

            System.out.print("Informe o sexo do usuario(masculino/feminino): ");
            settingsDatas.setSexUser(s.next());

            settingsDatas.setIdUser();

            SettingsDatas createUser = new SettingsDatas(
                    settingsDatas.getIdUser(),
                    settingsDatas.getNameUser(),
                    settingsDatas.getSexUser()
            );

            if(listUser.containsKey(createUser.getSexUser().toLowerCase())) {
                listUser.get(createUser.getSexUser()).add(createUser);

                System.out.println("Usuario adicionado com sucesso!!");
            } else {
                System.out.println("sexo invalido: " + createUser.getSexUser());

                System.out.println(" ");
                System.out.print("Você deseja tentar adicionar novamente(sim/não): ");
                options = s.next();

                continue;
            }

            System.out.println(" ");
            System.out.print("Você deseja adicionar mais usuarios a lista(sim/não): ");
            options = s.next();
        }

        if(listUser.get("masculino").isEmpty() && listUser.get("feminino").isEmpty()) {
            System.out.println("Sua lista de usuarios está vazia!!");
        } else {
            System.out.println("Lista masculino:");
            for(SettingsDatas user : listUser.get("masculino")) {
                System.out.println(user);
            }

            System.out.println("Lista do feminino:");
            for(SettingsDatas user : listUser.get("feminino")) {
                System.out.println(user);
            }
        }
    }
}
