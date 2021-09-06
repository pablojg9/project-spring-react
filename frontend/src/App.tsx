import Navbar from 'components/navbar';
import Footer from 'components/Footer';
import DataTable from 'components/datatable';
import BarChart from 'components/barchart';
import DonutChart from 'components/donutchart';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">taxa de sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">taxa de sucesso (%)</h5>
            <DonutChart />
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas as Vendas</h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
