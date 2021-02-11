import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PaisService {

  constructor(private http:HttpClient) { }

  public consultarPais(codigo_do_pais){
    return this.http.get("http://localhost:8080/pais/", codigo_do_pais);
  }
}
