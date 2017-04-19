package com.mediclaim.model;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@Entity
@Table(name = "diagnostics_center")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class DiagnosticsCenter {

}