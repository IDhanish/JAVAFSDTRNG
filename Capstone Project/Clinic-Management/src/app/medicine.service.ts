import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MedicineService {

  private baseUrl = 'http://localhost:8080/api/v1/medicines';

  constructor(private http: HttpClient) { }

  getMedicine(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  createMedicine(medicine: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, medicine);
  }

  updateMedicine(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  deleteMedicine(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${id}`, { responseType: 'text' });
  }

  getMedicinesList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
