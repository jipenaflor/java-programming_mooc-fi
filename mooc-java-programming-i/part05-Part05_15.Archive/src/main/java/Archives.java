/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jerome Penaflor
 */
public class Archives {
    
    private String name;
    private String identifier;
    
    public Archives(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getIdentifier() {
        return this.identifier;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        
        if (!(compared instanceof Archives)) {
            return false;
        }
        
        Archives comparedItem = (Archives) compared;
        
        return this.identifier.equals(comparedItem.identifier);
    }
    
    @Override
    public String toString() {
        return getIdentifier() +  ": " + getName();
    }
}
