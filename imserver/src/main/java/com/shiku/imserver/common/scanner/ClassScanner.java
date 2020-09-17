package com.shiku.imserver.common.scanner;

public class ClassScanner {
   public String[] scannerPackage(String namespace, String ext) throws Exception {
      new PackageScaner();
      String[] files = PackageScaner.scanNamespaceFiles(namespace, ext, false, true);
      return files;
   }
}
