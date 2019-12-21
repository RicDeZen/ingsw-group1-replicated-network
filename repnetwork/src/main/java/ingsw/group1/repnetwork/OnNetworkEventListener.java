package ingsw.group1.repnetwork;

import ingsw.group1.msglibrary.Message;

/**
 * Listener Interface to use as callback to notify a class of events related to the Network.
 * @author Riccardo De Zen.
 * @param <R>
 */
public interface OnNetworkEventListener<M extends Message, R extends Resource>{
    /**
     * Method called when a Resource has been obtained through the network.
     * @param resource the obtained Resource.
     */
    void onResourceObtained(R resource);

    /**
     * Method called when a message is received through the network.
     * @param message the received Message.
     */
    void onMessageReceived(M message);
}
