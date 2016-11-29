package com.artezio.vitebsk.user;

import java.util.HashMap;

import com.artezio.vitebsk.item.Item;


/**
 * Created by pskrebnev on 25.11.2016.
 * Describes the "actor" of the Digital Library
 */
public class User {
    private int userUniqueID;
    private String userEncryptedPassword;
    private String userName;
    private HashMap<Integer, Boolean> userRoles;

    /**
     * Takes the list of changed roles from the web-form
     * and change them to the set of Roles
     * Integer -- ID of Role
     * Boolean -- changed state
     * @param rightIDs
     */
    public void chadgeRights(HashMap<Integer, Boolean> rightIDs) {
        //TODO
    }

    /**
     * Add Item to the DB Strorage
     */
    public void addItem(Item item) {
        //TODO
    }

    /**
     * Delete Item from the DB Storage
     */
    public void deleteItem(int itemID) {
        //TODO
    }

    /**
     * Update Item in the DB Storage
     */
    public void updateItem(int itemID) {
        //TODO
    }

    /**
     * Hold/Reserve Item. It stops Item from the any actions from other users.
     * In case you reserve Item but not take it on your hands.
     */
    public void holdItem(int itemID) {
        //TODO
    }

    /**
     * Borrow Item.
     */



    /**
     * Describes the Role
     */
    class Role {
        private int roleID;
        private Boolean rightValid;
        private String roleName;
    }
}
