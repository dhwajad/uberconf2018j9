module com.agiledeveloper.producer {
  exports com.agiledeveloper.producer;             
  
  opens com.agiledeveloper.proprietary;
  
  // do not exports com.agiledeveloper.proprietary;
}