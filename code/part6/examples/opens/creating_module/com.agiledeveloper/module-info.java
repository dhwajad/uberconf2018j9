module com.agiledeveloper.util {   //open module com.agiledeveloper.util - will make all packages in this module available for reflection
  exports com.agiledeveloper.util;
  
  opens com.agiledeveloper.impl;
//  //this will open only the classes in that package
//  //for reflection access
//  
//  //In any case, the stuff in non exposed packages are still
//  //off limits during compilation.
}