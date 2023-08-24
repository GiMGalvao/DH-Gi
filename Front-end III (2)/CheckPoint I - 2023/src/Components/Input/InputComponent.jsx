import style from "./InputComponent.module.css";

function InputComponent({ title, type, value, fnOnChange }) {
    return (
        <div className={style.label}>
            <label > {title}</label>
            <br />

            <input className={style.input}
                type={type}
                value={value}
                onChange={fnOnChange}
            />
           
        </div>
    );
}

export default InputComponent;