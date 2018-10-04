package edu.cnm.deepdive.cryptography;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.stream.Collectors;

public class BundleSource implements WordSource {

  private ArrayList<String> words;

  public BundleSource(String basename) {
    ResourceBundle bundle = ResourceBundle.getBundle(basename);
    words = new ArrayList<>(
        bundle.keySet().stream() //returns a set of strings
            .map((k) -> bundle.getString(k)) // returns a stream of strings
            .collect(Collectors.toList()) // returns a list of strings object
    ); // taking a list and asking for an array list of those items
  }

  @Override
  public String get(int i) {
    return words.get(i);
  }

  @Override
  public int size() {
    return words.size();
  }
}
