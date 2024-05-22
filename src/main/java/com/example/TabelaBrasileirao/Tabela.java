package com.example.TabelaBrasileirao;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class Tabela {
    private ArrayList<ClubeFutebol> tabela = new ArrayList<>();

    public ArrayList<ClubeFutebol> getTabela() {
        return tabela;
    }

    public void addClube(ClubeFutebol clube){
        this.tabela.add(clube);
    }

}
