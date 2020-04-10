package main.java;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SocialNetwork<S> implements Iterable<S> {
    List<S> network;
    public SocialNetwork(Person... people){
        network = new LinkedList(Arrays.asList(people));
    }
    @Override
    public Iterator<S> iterator(){
        return network.iterator();
    }
}
