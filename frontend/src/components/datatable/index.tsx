const DataTable = () => {
    return (
        <div className="table-responsive">
            <table className="table table-striped table-sm">
                <thead>
                    <tr>
                        <td>Data</td>
                        <td>Vendedor</td>
                        <td>Cliente visitados</td>
                        <td>Négocios fechados</td>
                        <td>Valor</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>22/09/2004</td>
                        <td>Barry allen</td>
                        <td>32</td>
                        <td>25</td>
                        <td>15224.43</td>
                    </tr>
                </tbody>
            </table>
        </div>

    )
}

export default DataTable;