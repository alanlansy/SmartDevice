/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.mits.iot.smartdevice;


public interface Sensor<T> {
    public void setId();
    public char getId();
    public char status();
    public T read();
    public void write(T v);
}
