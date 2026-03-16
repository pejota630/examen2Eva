# TESTING - Análisis de Caja Negra para Empleado

## Criterios de aceptación
- Nombre: no vacío y más de una palabra.
- Cargo: debe pertenecer a la lista de cargos válidos (Cargos).
- Salario: no vacío, no negativo y no por debajo del convenio salarial (Constantes.CONVENIO_SALARIAL).

## Tabla 1: Análisis de parámetros
| Parámetro | Dominio válido | Dominio inválido |
|-----------|----------------|------------------|
| nombre    | cadena con >=2 palabras | null, "", "Juan" (una palabra) |
| cargo     | valores en Cargos.LISTA | cualquier string no listado |
| salario   | número >= CONVENIO_SALARIAL | NaN, número negativo, número < CONVENIO_SALARIAL |

## Tabla 2: Casos válidos
| Caso | nombre | cargo | salario | Resultado esperado |
|------|--------|-------|---------|--------------------|
| V1   | "Ana María" | "Diseñadora" | 30000 | Crear Empleado OK |
| V2   | "Luis Alberto" | "Desarrollador" | 20000 | Crear Empleado OK (igual convenio) |

## Tabla 3: Casos no válidos
| Caso | nombre | cargo | salario | Resultado esperado |
|------|--------|-------|---------|--------------------|
| N1   | "" | "Desarrollador" | 30000 | Excepción (nombre vacío) |
| N2   | "Juan" | "Desarrollador" | 30000 | Excepción (nombre una palabra) |
| N3   | "Luis Miguel" | "Cocinero" | 30000 | Excepción (cargo no válido) |
| N4   | "Luis Miguel" | "Gerente" | -1000 | Excepción (salario negativo) |
| N5   | "Luis Miguel" | "Gerente" | (CONVENIO_SALARIAL - 1) | Excepción (salario por debajo convenio) |
