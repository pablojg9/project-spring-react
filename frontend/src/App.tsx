import Navbar from 'components/navbar';
import Footer from 'components/Footer';
import DataTable from 'components/datatable';

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary">Olá, Mundo!</h1>

        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
