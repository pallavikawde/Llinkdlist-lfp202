package com.bridgelabz.linkedlist;

public interface INode<K> {

    // key and next
    public K getKey();
    INode getNext();


    public void setKey(K key);
    public void setNext(INode next);

}
