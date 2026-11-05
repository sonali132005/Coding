import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    employee = employee.drop_duplicates(subset=['salary'])
    employee = employee.sort_values(by='salary', ascending=False)

    if len(employee) < N or N < 1:
        return pd.DataFrame({f'getNthHighestSalary({N})': [None]})

    return pd.DataFrame({f'getNthHighestSalary({N})': [employee.iloc[N-1]['salary']]})