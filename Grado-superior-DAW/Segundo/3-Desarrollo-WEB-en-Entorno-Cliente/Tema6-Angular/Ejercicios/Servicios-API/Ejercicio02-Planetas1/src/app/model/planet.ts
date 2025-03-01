export interface Planetas {
  count: number;
  next: string;
  previous: null;
  results: Planeta[];
}

export interface Planeta {
  name: string;
  rotation_period: string;
  orbital_period: string;
  diameter: string;
  climate: string;
  gravity: string;
  terrain: string;
  surface_water: string;
  population: string;
}
